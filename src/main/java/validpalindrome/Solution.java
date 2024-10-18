package validpalindrome;

public class Solution {

    public boolean isPalindrome(String input) {
        int[] charArray = input.toLowerCase().chars()
            .filter(i -> Character.isAlphabetic(i) || Character.isDigit(i))
            .toArray();

        for (int index = 0; index < charArray.length / 2; index++) {
            if (charArray[index] != charArray[charArray.length - index - 1]) {
                return false;
            }
        }

        return true;
    }
}
