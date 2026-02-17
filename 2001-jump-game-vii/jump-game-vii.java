class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;

        int reachableCount = 0;

        for (int i = 1; i < n; i++) {

            // Add index entering the window
            if (i - minJump >= 0 && dp[i - minJump]) {
                reachableCount++;
            }

            // Remove index leaving the window
            if (i - maxJump - 1 >= 0 && dp[i - maxJump - 1]) {
                reachableCount--;
            }

            // If current is '0' and window has reachable index
            if (s.charAt(i) == '0' && reachableCount > 0) {
                dp[i] = true;
            }
        }

        return dp[n - 1];
    }
}
