class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return temp(nums,k)-temp(nums,k-1);
    }
    private int temp(int[] nums,int k){
        int l=0;
        int r=0;
        int len=0;
        int oddnum=0;
        while(r<nums.length){
            if(isOdd(nums[r])){
                oddnum++;
            }
            while(oddnum>k){
                if(isOdd(nums[l])){
                    oddnum--;
                }
                l++;
            }
           len=len+(r-l+1);
           r++; 
        }
        return len;
    }
    private boolean isOdd(int num){
        if(num%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}