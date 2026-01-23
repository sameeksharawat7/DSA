class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            if(i==findNums(nums,i)){
                return i;
            }
        }
        return -1;
    }
    public int findNums(int[] nums,int curnum){
        int start=0;
        int end=nums.length-1;
        int firstIndex=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=curnum){
                firstIndex=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return nums.length-firstIndex;
    }
}