class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            int lastBit=n&1;
            n=n>>1;
            int secLastBit=n&1;
            if(lastBit==secLastBit){
                return false;
            }
        }
        return true;
    }
}