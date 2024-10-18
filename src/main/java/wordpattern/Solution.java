package wordpattern;

import java.util.HashMap;

public class Solution {

    public boolean wordPattern(String pattern, String s) {

        char[] patternChars = pattern.toCharArray();
        String[] stringTokens = s.split(" ");

        if (patternChars.length != stringTokens.length) {
            return false;
        }

        HashMap<Character, String> tokensMapping = new HashMap<>();
        HashMap<String, Character> charMapping = new HashMap<>();

        for (int index = 0; index < patternChars.length; index++) {
            String mappedToken = tokensMapping.get(patternChars[index]);

            if (mappedToken != null && !mappedToken.equals(stringTokens[index])) {
                return false;
            }

            Character mappedChar = charMapping.get(stringTokens[index]);

            if (mappedChar != null && !mappedChar.equals(patternChars[index])) {
                return false;
            }

            tokensMapping.put(patternChars[index], stringTokens[index]);
            charMapping.put(stringTokens[index], patternChars[index]);
        }

        return true;
    }
}
