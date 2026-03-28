class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res= new HashSet<>();
        int total=1<<nums.length;
        for(int i=0; i<total;i++){
            List<Integer> subset=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    subset.add(nums[j]);
                }
            }
            res.add(subset);
        }
        return new ArrayList<>(res);
    }
}