import java.lang.Character;
import java.util.ArrayList;

public class Problem1Solution {
    public boolean hasAllUniqueCharacters(String input) {
        char[] inputArray = input.toCharArray();
        ArrayList<Character> existingCharacters = new ArrayList<>();
        for (char c : inputArray) {
            if (existingCharacters.contains(c)) {
                return false;
            }
            existingCharacters.add(c);
        }

        return true;
    }

    public boolean hasAllUniqueCharacters_InPlace(String input) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
