class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return temp(nums,goal)-temp(nums,goal-1);
    }
    private int temp(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;
        int r=0;
        int sum=0;
        int len=0;
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            len+=(r-l+1);
            r++;
        }
        return len;
    }
}