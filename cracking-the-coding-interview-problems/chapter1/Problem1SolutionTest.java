import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1SolutionTest {
    private Problem1Solution solution;

    @Before public void setUp() throws Exception {
        solution = new Problem1Solution();
    }

    @Test public void testHasAllUniqueCharacters() {
        assertTrue(solution.hasAllUniqueCharacters("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(solution.hasAllUniqueCharacters("phone"));
        assertFalse(solution.hasAllUniqueCharacters("foo"));
        assertFalse(solution.hasAllUniqueCharacters("queueing"));
    }

    @Test public void testHasAllUniqueCharacters_InPlace() {
        assertTrue(solution.hasAllUniqueCharacters_InPlace("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(solution.hasAllUniqueCharacters_InPlace("phone"));
        assertFalse(solution.hasAllUniqueCharacters_InPlace("foo"));
        assertFalse(solution.hasAllUniqueCharacters_InPlace("queueing"));
        assertFalse(solution.hasAllUniqueCharacters_InPlace("steer"));
    }
}