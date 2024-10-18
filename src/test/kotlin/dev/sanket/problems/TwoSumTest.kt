package dev.sanket.problems

import assertk.assertThat
import assertk.assertions.containsExactlyInAnyOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class TwoSumTest {

    private val twoSum = TwoSum()

    @ParameterizedTest(name = "{0}")
    @MethodSource("testData")
    fun `should pass`(name: String, nums: IntArray, target: Int) {
        val indexes = twoSum.twoSum(nums, target)

        assertThat(indexes).containsExactlyInAnyOrder(1, 2)
    }

    companion object {

        @JvmStatic
        fun testData() = listOf(
            Arguments.of("Input with same value addition", intArrayOf(3, 2, 4), 6)
        )
    }
}