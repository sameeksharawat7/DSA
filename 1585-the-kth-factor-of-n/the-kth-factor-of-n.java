class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> res= new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    res.add(i);
                }
                else{
                    res.add(i);
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        if(k>res.size()) return -1;
        return res.get(k-1);
    }
}