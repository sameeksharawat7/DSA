class Solution {
    public int missingNumber(int[] nums) {
        // int i=0;
        // while(i<nums.length){
        //     if(nums[i]==nums.length){
        //         i++;
        //         continue;
        //     }
        //     if(nums[i]!=i){
        //         swap(nums,nums[i],i);
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=j){
        //         return j;
        //     }
        // }
        // return nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}