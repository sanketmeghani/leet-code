package dev.sanket.dev.sanket.mergetwosortedlists

import dev.sanket.dev.sanket.common.ListNode

class Solution {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        if (list1 == null || list2 == null) {
            return list1 ?: list2
        }

        if (list1.`val` <= list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }

        list2.next = mergeTwoLists(list1, list2.next)
        return list2
    }
}
