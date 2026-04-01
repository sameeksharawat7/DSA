class Solution {
    public boolean isPowerOfFour(int n) {
        float temp=n;
        while(temp>=4){
            temp=temp/4;
        }
        return temp==1;
    }
}