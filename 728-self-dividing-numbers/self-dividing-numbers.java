class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDivide(i)){
                res.add(i);
            }
        }
        return res;
    }
    private boolean selfDivide(int n){
        int temp=n;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                return false;
            }
            if(temp%rem!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}