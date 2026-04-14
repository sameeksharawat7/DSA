class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int num:nums){
            res.put(num,res.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int key:res.keySet()){
            if(res.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}