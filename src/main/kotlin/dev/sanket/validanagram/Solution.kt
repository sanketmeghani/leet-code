package dev.sanket.dev.sanket.validanagram

import java.util.concurrent.atomic.AtomicInteger

class Solution {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val occurrences = mutableMapOf<Char, AtomicInteger>()

        for (ch in s.toCharArray()) occurrences.computeIfAbsent(ch) { AtomicInteger(0) }.incrementAndGet()

        for (ch in t.toCharArray()) {
            val remainingOccurrences = occurrences[ch]?.decrementAndGet()

            if (remainingOccurrences == null || remainingOccurrences < 0) {
                return false
            }
        }

        return true
    }
}