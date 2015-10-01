import java.util.ArrayList;
import java.util.Arrays;

public class Problem3Solution {
    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] array1 = s1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = s2.toCharArray();
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
