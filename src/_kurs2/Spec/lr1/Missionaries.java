package _kurs2.Spec.lr1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Missionaries {

    public static class MCState {
        private static final int MAX_NUM = 3;
        private final int wm; // ���������� � ��������� ������
        private final int wc; // ������� � ��������� ������
        private final int em; // ���������� � ���������� ������
        private final int ec; // ������� � ���������� ������
        private final boolean boat; // ����� �� �������� ������?

        public MCState(int missionaries, int cannibals, boolean boat) {
            wm = missionaries;
            wc = cannibals;
            em = MAX_NUM - wm;
            ec = MAX_NUM - wc;
            this.boat = boat;
        }

        @Override
        public String toString() {
            return String.format(
                    "On the west bank there are %d missionaries and %d cannibals.%n"
                            + "On the east bank there are %d missionaries and %d cannibals.%n"
                            + "The boat is on the %s bank.",
                    wm, wc, em, ec,
                    boat ? "west" : "east");
        }

        public boolean goalTest() {
            return isLegal() && em == MAX_NUM && ec == MAX_NUM;
        }

        public boolean isLegal() {
            if (wm < wc && wm > 0) {
                return false;
            }
            if (em < ec && em > 0) {
                return false;
            }
            return true;
        }

        public static List<MCState> successors(MCState mcs) {
            List<MCState> sucs = new ArrayList<>();
            if (mcs.boat) { // ����� �� �������� ������
                if (mcs.wm > 1) {
                    sucs.add(new MCState(mcs.wm - 2, mcs.wc, !mcs.boat));
                }
                if (mcs.wm > 0) {
                    sucs.add(new MCState(mcs.wm - 1, mcs.wc, !mcs.boat));
                }
                if (mcs.wc > 1) {
                    sucs.add(new MCState(mcs.wm, mcs.wc - 2, !mcs.boat));
                }
                if (mcs.wc > 0) {
                    sucs.add(new MCState(mcs.wm, mcs.wc - 1, !mcs.boat));
                }
                if (mcs.wc > 0 && mcs.wm > 0) {
                    sucs.add(new MCState(mcs.wm - 1, mcs.wc - 1, !mcs.boat));
                }
            } else { // ����� �� ��������� ������
                if (mcs.em > 1) {
                    sucs.add(new MCState(mcs.wm + 2, mcs.wc, !mcs.boat));
                }
                if (mcs.em > 0) {
                    sucs.add(new MCState(mcs.wm + 1, mcs.wc, !mcs.boat));
                }
                if (mcs.ec > 1) {
                    sucs.add(new MCState(mcs.wm, mcs.wc + 2, !mcs.boat));
                }
                if (mcs.ec > 0) {
                    sucs.add(new MCState(mcs.wm, mcs.wc + 1, !mcs.boat));
                }
                if (mcs.ec > 0 && mcs.em > 0) {
                    sucs.add(new MCState(mcs.wm + 1, mcs.wc + 1, !mcs.boat));
                }
            }
            sucs.removeIf(Predicate.not(MCState::isLegal));
            return sucs;
        }
    }

    public static void displaySolution(List<MCState> path) {
        if (path.size() == 0) { // �������� ������������
            return;
        }
        MCState oldState = path.get(0);
        System.out.println(oldState);
        for (MCState currentState : path.subList(1, path.size())) {
            if (currentState.boat) {
                System.out.printf("%d missionaries and %d cannibals moved from " +
                                "the east bank to the west bank.%n",
                        oldState.em - currentState.em,
                        oldState.ec - currentState.ec);
            } else {
                System.out.printf("%d missionaries and %d cannibals moved from " +
                                "the west bank to the east bank.%n",
                        oldState.wm - currentState.wm,
                        oldState.wc - currentState.wc);
            }
            System.out.println(currentState);
            oldState = currentState;
        }
    }

    public static void main(String[] args) {
        MCState start = new MCState(MCState.MAX_NUM, MCState.MAX_NUM, true);
        GenericSearch.Node<MCState> solution = GenericSearch.bfs(start, MCState::goalTest, MCState::successors);
        if (solution == null) {
            System.out.println("No solution found!");
        } else {
            List<MCState> path = GenericSearch.nodeToPath(solution);
            displaySolution(path);
        }
    }
}

