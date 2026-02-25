class Solution {
    public void sortColors(int[] nums) {
        //dutch flag
        // int low=0;
        // int mid=0;
        // int high=nums.length-1;
        // while(mid<=high){
        //     if(nums[mid]==0){
        //         swap(nums,low,mid);
        //         mid++;
        //         low++;
        //     }
        //     else if(nums[mid]==1){
        //         mid++;
        //     }
        //     else{
        //         swap(nums,mid,high);
        //         high--;
        //     }
        // }

        //counting sort
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int index=0;
        while(count0>0){
            nums[index++]=0;
            count0--;
        }
        while(count1>0){
            nums[index++]=1;
            count1--;
        }
        while(count2>0){
            nums[index++]=2;
            count2--;
        }

    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}