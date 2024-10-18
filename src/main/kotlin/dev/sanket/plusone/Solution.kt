package dev.sanket.dev.sanket.plusone

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1;

        for (index in digits.size - 1 downTo 0) {
            digits[index] = digits[index] + carry;
            carry = 0

            if (digits[index] == 10) {
                digits[index] = 0
                carry = 1
            }
        }

        if (carry == 1) {
            return intArrayOf(1, *digits)
        }

        return digits
    }
}