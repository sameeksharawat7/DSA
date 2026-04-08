class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int i=0;
        int minlen=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(sum>=target){
                minlen=Math.min(minlen,j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        return (minlen==Integer.MAX_VALUE) ? 0 : minlen;
    }
}