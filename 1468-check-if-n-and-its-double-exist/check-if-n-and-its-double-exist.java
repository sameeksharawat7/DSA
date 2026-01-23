class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            boolean found=binarySearch(arr,arr[i]*2,i);
            if(found==true){
                return true;
            }
            
        }
        return false;
    }
    public boolean binarySearch(int[] nums, int target,int skip) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid!=skip;
            }
            else if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false; 
    }
}