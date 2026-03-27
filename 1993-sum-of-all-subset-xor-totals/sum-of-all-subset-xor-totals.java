class Solution {
    public int subsetXORSum(int[] nums) {
        int totalxor=0;
        for(int n:nums){
            totalxor |= n;
        }
        return totalxor*(1<<(nums.length-1));
    }
}