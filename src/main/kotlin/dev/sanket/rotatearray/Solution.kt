package dev.sanket.dev.sanket.rotatearray

class Solution {

    fun rotate(nums: IntArray, k: Int): Unit {
        val effectiveRotations = k.mod(nums.size)

        if (effectiveRotations == 0 || effectiveRotations == nums.size) {
            return
        }

        val partition = nums.size.minus(effectiveRotations)

        for (i in 0 until partition.div(2)) {
            val temp = nums[i]
            nums[i] = nums[partition - i - 1]
            nums[partition - i - 1] = temp
        }

        for (i in partition until (nums.size + partition).div(2)) {
            val temp = nums[i]
            nums[i] = nums[nums.size + partition - i - 1]
            nums[nums.size + partition - i - 1] = temp
        }

        for (i in 0 until nums.size.div(2)) {
            val temp = nums[i]
            nums[i] = nums[nums.size - i - 1]
            nums[nums.size - i - 1] = temp
        }
    }
}