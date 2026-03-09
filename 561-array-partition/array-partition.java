class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int sum=0;
        while(j<nums.length && i<nums.length-1){
            sum=sum+Math.min(nums[i],nums[j]);
            i=j+1;
            j=i+1;
        }
        return sum;
    }
}