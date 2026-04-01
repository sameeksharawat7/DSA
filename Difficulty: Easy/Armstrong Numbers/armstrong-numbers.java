// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int ans=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem*rem;
            n=n/10;
        }
        return temp==ans;
    }
}