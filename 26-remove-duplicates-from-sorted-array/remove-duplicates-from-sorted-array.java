class Solution {
    public int removeDuplicates(int[] nums) {
        //sameeksha rawat
        int k=1;
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                j+=1;
                nums[j]=nums[i];
                k++;
            }
        i++;
        }
        return k;
    }
}