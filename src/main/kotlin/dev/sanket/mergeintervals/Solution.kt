package dev.sanket.mergeintervals

import kotlin.math.max

class Solution {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        if (intervals.size == 1) {
            return intervals
        }

        val sortedIntervals = intervals.sortedBy { it[0] }
        val mergedIntervals = mutableListOf<IntArray>()

        var start = sortedIntervals[0][0]
        var end = sortedIntervals[0][1]

        for (index in 1 until sortedIntervals.size) {
            val nextInterval = sortedIntervals[index]

            if (nextInterval[0] <= end) {
                end = max(end, nextInterval[1])
            } else {
                mergedIntervals.add(intArrayOf(start, end))
                start = nextInterval[0]
                end = nextInterval[1]
            }
        }

        mergedIntervals.add(intArrayOf(start, end))

        return mergedIntervals.toTypedArray()
    }
}