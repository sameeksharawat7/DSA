class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;
        for(int i:aliceSizes){
            sumA+=i;
        } 
        for(int i:bobSizes){
            sumB+=i;
        } 
        int dif=(sumA-sumB)/2;
        Arrays.sort(bobSizes);
        for(int x:aliceSizes){
            int y=x-dif;
            int idx=binarySearch(bobSizes,y);
            if(idx!=-1){
                return new int[]{x,y};
            }
        }
        return new int[0];

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