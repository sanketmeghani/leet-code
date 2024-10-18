package dev.sanket.dev.sanket.common

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun next(next: ListNode?): ListNode {
        this.next = next
        return this
    }
}