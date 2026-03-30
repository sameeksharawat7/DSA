class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor){
            return 1;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign=true;
        if(dividend>=0 && divisor<0){
            sign=false;
        }
        if(dividend<0 && divisor>0){
            sign=false;
        }
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;
        for(int i=31;i>=0;i--){
            if(n>=(d<<i)){
                ans=ans + (1L<<i);
                n=n-(d<<i);
            }
           
        }
        ans=sign? ans: -ans;
        return (int)ans;
    }
}