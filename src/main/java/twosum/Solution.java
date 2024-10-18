package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            int reminder = target - nums[index];

            if (map.containsKey(reminder) && map.get(reminder) != index) {
                return new int[]{index, map.get(reminder)};
            }
        }

        return new int[]{};
    }
}
