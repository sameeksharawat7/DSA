class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> res=new HashMap<>();
        int sum=0;
        int count=0;
        res.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(res.containsKey(sum-k)){
                count+=res.get(sum-k);
            }
            res.put(sum, res.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}