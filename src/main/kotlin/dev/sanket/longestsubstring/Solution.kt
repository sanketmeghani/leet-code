package dev.sanket.dev.sanket.longestsubstring

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val uniqCharacters = mutableSetOf<Char>()
        var start = 0

        for ((index, ch) in s.toCharArray().withIndex()) {
            if (uniqCharacters.contains(ch)) {
                maxLength = max(maxLength, uniqCharacters.size)

                if (s[start] == ch) {
                    start++
                } else {
                    while (s[start] != ch) {
                        uniqCharacters.remove(s[start])
                        start++
                    }

                    start++
                    uniqCharacters.add(ch)
                }
            } else {
                uniqCharacters.add(ch)
            }
        }

        return max(maxLength, uniqCharacters.size)
    }
}
