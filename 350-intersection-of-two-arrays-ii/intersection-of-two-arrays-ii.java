class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        ArrayList<Integer> set = new ArrayList<>();
        for(int i:nums1){
            int idx=binarySearch(nums2,i);
            if(idx!=-1){
            set.add(i);
            nums2[idx]=Integer.MIN_VALUE;
            Arrays.sort(nums2);
            }
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(int val:set){
            ans[i++]=val;
        }
        return ans;
    }
    public int binarySearch(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;  
    }
}