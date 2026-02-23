class Solution {
    public int findNumbers(int[] nums) {
        int dig=0;
        for(int i=0;i<nums.length;i++){
            // int count=(int)(Math.log10(nums[i])+1);//calculate digits
            int count=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0){
                dig++;
            }
        }
        return dig;
    }
}