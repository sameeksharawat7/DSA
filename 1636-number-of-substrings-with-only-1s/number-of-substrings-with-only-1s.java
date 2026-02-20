class Solution {
    public int numSub(String s) {
        long sum=0;
        int ones=0;
        int mod = 1000000007;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            else{
                sum+=(long) ones*(ones+1)/2;
                sum%=mod;
                ones=0;
            }
        }
        sum+=(long) ones*(ones+1)/2;
        sum%=mod;
        return (int)sum;
    }
}