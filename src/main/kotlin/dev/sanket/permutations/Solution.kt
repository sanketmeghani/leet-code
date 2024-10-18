package dev.sanket.dev.sanket.permutations

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val permutations = mutableListOf<List<Int>>()
        permutations(nums, permutations, mutableSetOf())
        return permutations
    }

    private fun permutations(
        nums: IntArray,
        permutations: MutableList<List<Int>>,
        currentPermutation: MutableSet<Int>
    ) {
        if (currentPermutation.size == nums.size) {
            permutations.add(currentPermutation.toList())
            return
        }

        for (num in nums) {
            if (!currentPermutation.contains(num)) {
                currentPermutation.add(num)
                permutations(nums, permutations, currentPermutation)
                currentPermutation.remove(num)
            }
        }
    }
}