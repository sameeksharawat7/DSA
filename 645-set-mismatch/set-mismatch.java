class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] list= new int[2];
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list[0]=nums[j];
                list[1]=j+1;
            }
        }
        return list;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}