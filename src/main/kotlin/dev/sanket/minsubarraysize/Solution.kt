package dev.sanket.dev.sanket.minsubarraysize

import kotlin.math.min

class Solution {

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minSize = Int.MAX_VALUE
        var start = 0
        var end = 0
        var sum = 0

        while (end < nums.size) {
            sum += nums[end]

            if (sum >= target) {
                while (sum - nums[start] >= target) {
                    sum -= nums[start]
                    start++
                }

                minSize = min(minSize, end - start + 1)
            }

            end++
        }

        return if (minSize == Int.MAX_VALUE) 0 else minSize;
    }
}