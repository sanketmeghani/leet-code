package singlenumber;

public class Solution {

    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int number : nums) {
            singleNumber = singleNumber ^ number;
        }

        return singleNumber;
    }
}
