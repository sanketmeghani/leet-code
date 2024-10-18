package climbstairs;

public class Solution {

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairUsingMemo(n, memo);
    }

    private int climbStairUsingMemo(int n, int[] memo) {
        if (n == 0 || n == 1) {
            memo[n] = 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = climbStairUsingMemo(n - 1, memo) + climbStairUsingMemo(n - 2, memo);
        return memo[n];
    }
}
