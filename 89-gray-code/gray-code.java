class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<>();
        // res.add(0);
        // if(n==0){
        //     return res;
        // }
        // res.add(1);
        // int cur=1;
        // for(int i=2;i<=n;i++){
        //     cur=cur*2;
        //     for(int j=res.size()-1;j>=0;j--){
        //         res.add(cur+res.get(j));
        //     }
        // }
        // return res;
        for(int i=0;i<(1<<n);i++){
            res.add(i^(i>>1));
        }
        return res;
    }
}