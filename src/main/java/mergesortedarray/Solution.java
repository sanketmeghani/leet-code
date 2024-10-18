package mergesortedarray;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        /**
         * i -> m
         * j -> n
         *
         *
         */

        int firstIndex = m - 1;
        int secondIndex = n - 1;

        for (int index = nums1.length-1; index >= 0; index--) {
            int finalValue;

            if (firstIndex >= 0) {
                if (secondIndex >= 0) {
                    if (nums1[firstIndex] >= nums2[secondIndex]) {
                        finalValue = nums1[firstIndex];
                        firstIndex--;
                    } else {
                        finalValue = nums2[secondIndex];
                        secondIndex--;
                    }
                } else {
                    finalValue = nums1[firstIndex];
                    firstIndex--;
                }
            } else {
                finalValue = nums2[secondIndex];
                secondIndex--;
            }

            nums1[index] = finalValue;
        }
    }
}
