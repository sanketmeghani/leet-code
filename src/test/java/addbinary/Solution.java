package addbinary;

public class Solution {
    public String addBinary(String a, String b) {
        char[] first = a.length() > b.length() ? a.toCharArray() : b.toCharArray();
        char[] second = a.length() > b.length() ? b.toCharArray() : a.toCharArray();
        char carry = '0';
        StringBuilder output = new StringBuilder();

        for (int index = 0; index < second.length; index++) {
            if (first[first.length - index - 1] == '1' && second[second.length - index - 1] == '1') {
                if (carry == '1') {
                    output.append('1');
                } else {
                    output.append('0');
                }
                carry = '1';
            } else if (first[first.length - index - 1] == '1' || second[second.length - index - 1] == '1') {
                if (carry == '1') {
                    output.append('0');
                } else {
                    output.append('1');
                }

            } else if (carry == '1') {
                output.append('1');
                carry = '0';
            } else {
                output.append('0');
            }
        }

        for (int index = first.length - second.length - 1; index >= 0; index--) {
            if (first[index] == '1') {
                if (carry == '1') {
                    output.append('0');
                } else {
                    output.append('1');
                }
            } else if (carry == '1') {
                output.append('1');
                carry = '0';
            } else {
                output.append('0');
            }
        }

        if (carry == '1') {
            output.append('1');
        }

        return output.reverse().toString();
    }
}
