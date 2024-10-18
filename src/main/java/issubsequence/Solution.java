package issubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int tIndex = 0;
        int sIndex = 0;

        while (sIndex < sChars.length && tIndex < tChars.length) {
            if (sChars[sIndex] == tChars[tIndex]) {
                sIndex++;
                tIndex++;
            } else {
                tIndex++;
            }
        }

        return sIndex >= sChars.length;
    }
}
