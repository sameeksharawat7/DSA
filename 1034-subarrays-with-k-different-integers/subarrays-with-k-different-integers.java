class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    int atMost(int[] nums,int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        int l=0;
        int r=0;
        int total=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l+=1;
            }
            total+=r-l+1;
            r+=1;
        }
        return total;
    }
}