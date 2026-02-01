class Solution {
    public void rotate(int[] nums, int k) {
        // int[] res=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     res[(i+k)%nums.length]=nums[i];
        // }
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = res[i];
        // }
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public void reverse(int[] num,int start,int end){
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}