class Solution {
    public boolean isPowerOfTwo(int n) {
        //approach 1
        // if(n <= 0) return false;
        
        // while(n % 2 == 0){
        //     n = n / 2;
        // }
        // return n == 1;

        //approach 2
        // return (n>0 && (n&n-1)==0);

        //approach 3
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);

    }
    
}