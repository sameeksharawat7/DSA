class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        Integer[][] dp = new Integer[obstacleGrid.length][obstacleGrid[0].length];
        return helper(obstacleGrid,0,0,dp);
    }
    private int helper(int[][] maze,int r,int c,Integer[][] dp){
        if(r>=maze.length || c>=maze[0].length){
            return 0;
        }
        if(maze[r][c]==1){
            return 0;
        }
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return 1;
        }
        if (dp[r][c] != null) {
            return dp[r][c];
        }
        int left=helper(maze,r+1,c,dp);
        int right=helper(maze,r,c+1,dp);
        return dp[r][c]=left+right;
    }
}