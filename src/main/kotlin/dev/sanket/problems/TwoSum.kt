package dev.sanket.problems

class TwoSum {
    /**
     * https://leetcode.com/problems/two-sum/description/
     */

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            map[nums[index]] = index
        }

        var index = 0;

        while (index < nums.size) {
            val remaining = target - nums[index]

            if (map.containsKey(remaining)) {
                val otherIndex = map[remaining]
                requireNotNull(otherIndex)

                if (otherIndex != index) {
                    return intArrayOf(index, otherIndex)
                }
            }

            index++
        }

        error("Target not found")
    }
}