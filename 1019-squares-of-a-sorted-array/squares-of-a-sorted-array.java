class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        while(i<=j){
            int num1=(int)Math.pow(nums[i],2);
            int num2=(int)Math.pow(nums[j],2);
            if(num1>num2){
                ans[k--]=num1;
                i++;
            }
            else{
                ans[k--]=num2;
                j--;
            }
        }
        return ans;
    }
}