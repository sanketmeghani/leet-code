package dev.sanket.dev.sanket.groupanagrams

class Solution {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groupsMap = mutableMapOf<MutableList<Int>, MutableList<String>>()

        for (string in strs) {
            val key = MutableList(26) { 0 }

            for (ch in string.chars()) {
                key[ch - 97] = key[ch - 97] + 1
            }

            val group = groupsMap.getOrDefault(key, mutableListOf())
            group.add(string)

            groupsMap[key] = group
        }

        return groupsMap.values.toList()
    }
}