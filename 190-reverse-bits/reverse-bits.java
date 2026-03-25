class Solution {
    public int reverseBits(int n) {
        int num=0;
        for(int i=0;i<32;i++){
            int bit=n&1;
            num=(num<<1)|bit;
            n=n>>1;
        }
        return num;
    }
}