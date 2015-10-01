import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3SolutionTest {
    private Problem3Solution solution;

    @Before public void setUp() throws Exception {
        solution = new Problem3Solution();
    }

    @Test public void testIsPermutation() throws Exception {
        assertTrue(solution.isPermutation("fire", "rife"));
        assertTrue(solution.isPermutation("abcde", "dcbea"));
        assertTrue(solution.isPermutation("quiet", "quite"));
        assertFalse(solution.isPermutation("smaller", "similar"));
        assertFalse(solution.isPermutation("catch", "crash"));
        assertFalse(solution.isPermutation("different", "length"));
    }
}