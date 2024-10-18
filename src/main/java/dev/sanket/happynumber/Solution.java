package dev.sanket.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        int num = n;
        Set<Integer> cache = new HashSet<>();

        while (true) {
            int sum = 0;

            while (num != 0) {
                sum = sum + (num % 10) * (num % 10);
                num = num / 10;
            }

            if (sum == 1) {
                return true;
            } else if (cache.contains(sum)) {
                return false;
            }

            cache.add(sum);
            num = sum;
        }
    }
}
