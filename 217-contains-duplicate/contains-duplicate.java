class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}