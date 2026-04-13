class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int j=n-1;j>index;j--){
            if(nums[j]>nums[index]){
                swap(nums,j,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);

    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}