class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] dp=new boolean[n];
        dp[0]=true;
        int count=0;

        for(int i=1;i<n;i++){
            int addindx=i-minJump;
            if(addindx>=0 && dp[addindx]){
                count++;
            }
            int leaveindx=i-maxJump-1;
            if(leaveindx>=0 && dp[leaveindx]){
                count--;
            }
            if(count>0 && s.charAt(i)=='0'){
                dp[i]=true;
            }
        }
        return dp[n-1];
    }
}
