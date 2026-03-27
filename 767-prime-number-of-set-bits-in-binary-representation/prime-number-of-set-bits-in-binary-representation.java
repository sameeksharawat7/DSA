class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left ;i<=right ;i++){
            if(setBit(i)==true){
                count++;
            }
        }
        return count;
    }
    private boolean setBit(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return isPrime(count);
    }
    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}