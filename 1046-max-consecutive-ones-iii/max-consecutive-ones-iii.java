class Solution {
    public int longestOnes(int[] nums, int k) {
      int l=0;
      int r=0;
      int maxlen=0;
      int numberOfzero=k;
      while(r<nums.length){
        if(nums[r]==0){
            while(numberOfzero<=0){
                if(nums[l]<=0){
                    numberOfzero++;
                }
                l++;
            }
            numberOfzero--;
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
      }
      return maxlen;
    }
}