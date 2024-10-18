package dev.sanket.dev.sanket.sqrt

class Solution {

    fun mySqrt(x: Int): Int {
        if (x == 1) return 1;

        var start = 0;
        var end = x;
        var sqrt = (end + start) / 2;

        while (end >= start) {
            val square = sqrt.toLong().times(sqrt)

            if (square == x.toLong()) return sqrt

            if (square > x) {
                end = sqrt - 1
            } else {
                start = sqrt + 1
            }

            sqrt = (end + start) / 2
        }

        return sqrt
    }
}