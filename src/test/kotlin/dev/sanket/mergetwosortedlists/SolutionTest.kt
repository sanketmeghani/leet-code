package dev.sanket.mergetwosortedlists

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import dev.sanket.dev.sanket.common.ListNode
import dev.sanket.dev.sanket.mergetwosortedlists.Solution
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun shouldReturnNullWhenBothListsAreNull() {
        val mergedList = solution.mergeTwoLists(null, null)

        assertThat(mergedList).isNull()
    }

    @Test
    fun shouldReturnListOneWhenListTwoIsNull() {
        val listOne = ListNode(1).next(ListNode(3).next(ListNode(4)))

        val mergedList = solution.mergeTwoLists(listOne, null)

        var currentNode = mergedList
        arrayOf(1, 3, 4).forEach {
            assertThat(currentNode?.`val`).isEqualTo(it)
            currentNode = currentNode?.next
        }
    }

    @Test
    fun shouldReturnListTwoWhenListOneIsNull() {
        val listTwo = ListNode(1).next(ListNode(3).next(ListNode(4)))

        val mergedList = solution.mergeTwoLists(null, listTwo)

        var currentNode = mergedList
        arrayOf(1, 3, 4).forEach {
            assertThat(currentNode?.`val`).isEqualTo(it)
            currentNode = currentNode?.next
        }
    }

    @Test
    fun testOne() {
        val listOne = ListNode(1).next(ListNode(2).next(ListNode(4)))
        val listTwo = ListNode(1).next(ListNode(3).next(ListNode(4)))

        val mergedList = solution.mergeTwoLists(listOne, listTwo)

        var currentNode = mergedList
        arrayOf(1, 1, 2, 3, 4, 4).forEach {
            assertThat(currentNode?.`val`).isEqualTo(it)
            currentNode = currentNode?.next
        }
    }
}