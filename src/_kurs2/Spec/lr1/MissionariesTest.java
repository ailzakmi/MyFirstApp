package _kurs2.Spec.lr1;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class MissionariesTest {

    @Test
    public void testGoalState() {
        Missionaries.MCState goalState = new Missionaries.MCState(3, 3, false);
        assertTrue(goalState.goalTest());
    }

    @Test
    public void testIllegalState() {
        Missionaries.MCState illegalState = new Missionaries.MCState(2, 3, true);
        assertFalse(illegalState.isLegal());
    }

    @Test
    public void testSuccessors() {
        Missionaries.MCState initialState = new Missionaries.MCState(3, 3, true);
        List<Missionaries.MCState> successors = Missionaries.MCState.successors(initialState);

        assertEquals(5, successors.size());
        assertTrue(successors.contains(new Missionaries.MCState(1, 3, false)));
        assertTrue(successors.contains(new Missionaries.MCState(2, 2, false)));
        assertTrue(successors.contains(new Missionaries.MCState(3, 1, false)));
        assertTrue(successors.contains(new Missionaries.MCState(3, 2, false)));
        assertTrue(successors.contains(new Missionaries.MCState(3, 1, false)));
    }
}

