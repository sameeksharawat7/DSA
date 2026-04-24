class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp=new Integer[m+1][n+1];
        return helper(m,n,dp);
    }
    private int helper(int r,int c,Integer[][] dp){
        if(r==1 || c==1){
            return 1;
        }
        if(dp[r][c]!=null){
            return dp[r][c];
        }
        int left=helper(r-1,c,dp);
        int right=helper(r,c-1,dp);
        return dp[r][c]=left+right;
    }
}