class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        int ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long k = mid * (mid + 1) / 2;

            if (k <= n) {
                ans = (int) mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
