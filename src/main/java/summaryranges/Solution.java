package summaryranges;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        int startIndex = 0;
        int endIndex = 1;
        List<int[]> rangeInts = new LinkedList<>();

        while (endIndex < nums.length) {
            if ((nums[endIndex] - nums[startIndex]) != (endIndex - startIndex)) {
                rangeInts.add(new int[]{nums[startIndex], nums[endIndex - 1]});

                startIndex = endIndex;
            }

            endIndex++;
        }

        rangeInts.add(new int[]{nums[startIndex], nums[endIndex - 1]});

        return rangeInts.stream()
            .map(range -> (range[0] == range[1]) ? String.valueOf(range[0]) : range[0] + "->" + range[1])
            .toList();
    }
}
