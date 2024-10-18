package dev.sanket.dev.sanket.linkedlistcycle

import dev.sanket.dev.sanket.common.ListNode

class Solution {

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }

        var slowPointer = head
        var fastPointer = head.next?.next

        while (fastPointer != null) {
            if (fastPointer == slowPointer) {
                return true
            }

            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next
        }

        return false
    }
}