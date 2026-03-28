class Solution {
    public int numberOfSteps(int n) {
        //BITWISE
        // int count=0;
        // while(n>0){
        //     if((n&1)==0){
        //         n=n/2;
        //     }
        //     else{
        //         n=n-1;
        //     }
        //     count++;
        // }
        // return count;

        //RECURSION
        return helper(n,0);
    }
    public int helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);
        }
        else{
            return helper(num-1,count+1);
        }
    }
}