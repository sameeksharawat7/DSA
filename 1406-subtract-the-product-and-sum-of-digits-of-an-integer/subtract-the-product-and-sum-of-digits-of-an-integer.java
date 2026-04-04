class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;
            product = product * temp;
            n = n / 10;
        }
        int result = product - sum;
        return result;
    }
}