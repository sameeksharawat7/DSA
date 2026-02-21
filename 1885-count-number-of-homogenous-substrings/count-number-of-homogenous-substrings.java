class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        long sum=0;
        int count=1;
        for(int i=0;i<s.length();i++){
            if( i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else{
                sum+=(long) count*(count+1)/2;
                sum%=mod;
                count=1;
            }
        }
        return (int)sum;
    }
}