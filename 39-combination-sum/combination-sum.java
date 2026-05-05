class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    void helper(int[] arr,int index,int target,ArrayList<Integer> p,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(p));
            return;
        }
        if(index==arr.length || target<0){
            return;
        }
        p.add(arr[index]);
        helper(arr,index,target-arr[index],p,result);
        p.remove(p.size()-1);
        helper(arr,index+1,target,p,result);
    }
}