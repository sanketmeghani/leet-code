package numberofones;

public class Solution {

    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;

        while (n != 0) {
            if ((n & mask) != 0) {
                count++;
            }

            n >>= 1;
        }

        return count;
    }
}
