class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return help(nums,0,target,0);
    }
    private int help(int[] nums,int sum,int target,int index){
        if(index == nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        
        int plus=help(nums,sum+nums[index],target,index+1);
        int minus=help(nums,sum-nums[index],target,index+1);
        return plus+minus;
    }
}