package dev.sanket.dev.sanket.isomorphicstrings

class Solution {
    fun isIsomorphic(
        s: String,
        t: String,
    ): Boolean {
        if (s.length != t.length) return false

        if (s == t) return true

        val forwardMapping = mutableMapOf<Char, Char>()
        val reverseMapping = mutableMapOf<Char, Char>()

        val tChars = t.toCharArray()
        s.toCharArray().forEachIndexed { index, sChar ->
            val tChar = tChars[index]

            if (forwardMapping.contains(sChar)) {
                val existingMapping = forwardMapping[sChar]

                if (existingMapping != tChar || reverseMapping[tChar] != sChar) {
                    return false
                }
            } else if (reverseMapping.contains(tChar)) {
                return false
            } else {
                forwardMapping[sChar] = tChar
                reverseMapping[tChar] = sChar
            }
        }

        return true
    }
}
