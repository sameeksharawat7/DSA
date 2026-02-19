class Solution {
    public String multiply(String num1, String num2) {

        // Edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] res = new int[m + n];

        // Traverse from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int pos2 = i + j + 1;  // current position
                int pos1 = i + j;      // carry position

                int sum = product + res[pos2];

                res[pos2] = sum % 10;          // store unit digit
                res[pos1] += sum / 10;         // add carry
            }
        }

        // Build result string
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
