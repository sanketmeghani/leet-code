package ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char ch: magazine.toCharArray()) {
            Integer occurrences = magazineMap.getOrDefault(ch, 0);
            magazineMap.put(ch, occurrences + 1);
        }

        for (char ch: ransomNote.toCharArray()) {
            Integer occurrences = magazineMap.getOrDefault(ch, 0);

            if (occurrences == 0) {
                return false;
            }

            magazineMap.put(ch, occurrences - 1);
        }

        return true;
    }
}
