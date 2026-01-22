class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            if(binarySearch(nums2,i)){
            set.add(i);
            }
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(int val:set){
            ans[i++]=val;
        }
        return ans;
    }
    public boolean binarySearch(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
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