package palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int reminder = x;
        int reversedNumber = 0;

        while (reminder / 10 > 0) {
            int lastDigit = reminder % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;

            reminder = reminder / 10;
        }

        reversedNumber = (reversedNumber * 10) + reminder;

        return x == reversedNumber;
    }
}
