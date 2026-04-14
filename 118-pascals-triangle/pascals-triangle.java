class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }
    private List<Integer> generateRow(int row){
        List<Integer> res=new ArrayList<>();
        int ans=1;
        res.add(ans);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }
}