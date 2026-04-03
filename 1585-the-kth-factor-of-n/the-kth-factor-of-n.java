class Solution {
    public int kthFactor(int n, int k) {
        // List<Integer> res= new ArrayList<>();
        // for(int i=1;i*i<=n;i++){
        //     if(n%i==0){
        //         if(n/i==i){
        //             res.add(i);
        //         }
        //         else{
        //             res.add(i);
        //             res.add(n/i);
        //         }
        //     }
        // }
        // Collections.sort(res);
        // if(k>res.size()) return -1;
        // return res.get(k-1);
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(k==count){
                    return i;
                }
            }
        }
        for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n%i==0){
                if(i*i==n){
                    continue;
                }
                count++;
                if(count==k){
                    return n/i;
                }
            }
        }
        return -1;
    }
}