package dev.sanket.dev.sanket.majorityelement

import java.util.concurrent.atomic.AtomicInteger

class Solution {

    fun majorityElement(nums: IntArray): Int {
        val occurrences = mutableMapOf<Int, AtomicInteger>()
        var maxCount = 0
        var majorityElement = 0;

        for (num in nums) {
            val newCount = occurrences.computeIfAbsent(num) { AtomicInteger() }.incrementAndGet()

            if (newCount > maxCount) {
                maxCount = newCount
                majorityElement = num
            }
        }

        return majorityElement
    }
}