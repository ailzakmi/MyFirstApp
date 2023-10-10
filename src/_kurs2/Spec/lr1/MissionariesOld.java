//package _kurs2.Spec._kurs1.lr1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class MissionariesOld {
//    public class MCState {
//        private static final int MAX_NUM = 3;
//        private final int wm; //миссионеры с западного берега
//        private final int wc; //людоеды с западного берега
//        private final int em; // миссионеры с восточного берега
//        private final int ec; //людоеды с восточного берега
//        private final boolean boat; // лодка на западном берегу?
//
//
//        public MCState(int missionaries, int cannibals, boolean boat) {
//            wm = missionaries;
//            wc = cannibals;
//            em = MAX_NUM - wm;
//            ec = MAX_NUM - wc;
//            this.boat = boat;
//        }
//
//        @Override
//        public String toString() {
//            return String.format(
//                    "On the west bank there are %d missionaries and %d canibals.%n"
//                            + "On the east bank there are %d missionaries and %d canibals.%n"
//                            + "The boat is on the %s bank.",
//                    wm, wc, em, ec,
//                    boat ? "west" : "east");
//        }
//
//        public boolean goalTeas() {
//            return isLegal() && em == MAX_NUM && ec == MAX_NUM;
//        }
//
//        public boolean isLegal() {
//            if (wm < wc && wm > 0) {
//                return false;
//            }
//            if (em < ec && em > 0) {
//                return false;
//            }
//            return true;
//        }
//        public static List<MCState> successors(MCState mcs) {
//            List<MCState> sucs = new ArrayList<>();
//            if (mcs.boat) { // лодка на западном берегу
//                if (mcs.wm > 1) {
//                    sucs.add(new MCState(mcs.wm - 2, mcs.wc, !mcs.boat));
//                }
//                if (mcs.wm > 0) {
//                    sucs.add(new MCState(mcs.wm - 1, mcs.wc, !mcs.boat));
//                }
//                if (mcs.wc > 1) {
//                    sucs.add(new MCState(mcs.wm, mcs.wc - 2, !mcs.boat));
//                }
//                if (mcs.wc > 0) {
//                    sucs.add(new MCState(mcs.wm, mcs.wc - 1, !mcs.boat));
//                }
//                if (mcs.wm > 0 && mcs.wc > 0) {
//                    sucs.add(new MCState(mcs.wm - 1, mcs.wc - 1, !mcs.boat));
//                }
//            } else { // лодка на восточном берегу
//                if (mcs.em > 1) {
//                    sucs.add(new MCState(mcs.wm + 2, mcs.wc, !mcs.boat));
//                }
//                if (mcs.em > 0) {
//                    sucs.add(new MCState(mcs.wm + 1, mcs.wc, !mcs.boat));
//                }
//                if (mcs.ec > 1) {
//                    sucs.add(new MCState(mcs.wm, mcs.wc + 2, !mcs.boat));
//                }
//                if (mcs.em > 0) {
//                    sucs.add(new MCState(mcs.wm, mcs.wc + 1, !mcs.boat));
//                }
//                if (mcs.ec > 0 && mcs.em > 0) {
//                    sucs.add(new MCState(mcs.wm + 1, mcs.wc + 1, !mcs.boat));
//                }
//            }
//            sucs.removeIf(Predicate.not(MCState::isLegal));
//            return sucs;
//        }
//        @Override
//        public int hashCode() {
//            final int prime = 31;
//            int result = 1;
//            result = prime * result + (boat ? 1231 : 1237);
//            result = prime * result + ec;
//            result = prime * result + em;
//            result = prime * result + wc;
//            result = prime * result + wm;
//            return result;
//        }
//        public boolean goalTest() {
//            return isLegal() && em == MAX_NUM && ec == MAX_NUM;
//        }
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) {
//                return true;
//            }
//            if (obj == null) {
//                return false;
//            }
//            if (getClass() != obj.getClass()) {
//                return false;
//            }
//            MCState other = (MCState) obj;
//            if (boat != other.boat) {
//                return false;
//            }
//            if (ec != other.ec) {
//                return false;
//            }
//            if (em != other.em) {
//                return false;
//            }
//            if (wc != other.wc) {
//                return false;
//            }
//            if (wm != other.wm) {
//                return false;
//            }
//            return true;
//        }
//    }
//
//    public static void displaySolution(List<MCState> path) {
//        if (path.size() == 0) { // проверка правильности
//            return;
//        }
//        MCState oldState = path.get(0);
//        System.out.println(oldState);
//        for (MCState currentState : path.subList(1, path.size())) {
//            if (currentState.boat) {
//                System.out.printf("%d missionaries and %d canibals movad from the east bank to the west bank.%n",
//                        oldState.em - currentState.em,
//                        oldState.ec - currentState.ec);
//            } else {
//                System.out.printf("%d missionaries and %d canibals movad from the east bank to the west bank.%n",
//                        oldState.wm - currentState.wm,
//                        oldState.wc - currentState.wc);
//            }
//            System.out.println(currentState);
//            oldState = currentState;
//        }
//    }
//    public static void main(String[] args) {
//        MCState2.MCState start = new MCState2.MCState(MissionariesOld.MCState.MAX_NUM, MissionariesOld.MCState.MAX_NUM, true);
//        GenericSearch.Node<MissionariesOld.MCState> solution = GenericSearch.bfs(start, MissionariesOld.MCState::goalTest, MissionariesOld.MCState::successors);
//        if (solution == null) {
//            System.out.println("No solution found!");
//        } else {
//            List<MissionariesOld.MCState> path = GenericSearch.nodeToPath(solution);
//            displaySolution(path);
//        }
//    }
//}