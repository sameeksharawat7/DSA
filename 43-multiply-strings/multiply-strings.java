class Solution {
    public String multiply(String num1, String num2) {
        char[] s1=solve(num1);
        char[] s2=solve(num2);
        int[] res=new int[s1.length+s2.length];
        for(int i=0;i<s1.length;i++){
            int carry=0;
            int start=i;
            for(int j=0;j<s2.length;j++){
                int n1=s1[i]-'0';
                int n2=s2[j]-'0';
                int sum=(n1*n2)+res[start]+carry;
                int base=sum%10;
                carry=sum/10;
                res[start++]=base;
            }
            if(carry!=0) res[start]=carry;
        }
        int i=res.length-1;
        while(i>0 && res[i]==0){
            i--;
        }
        String ans="";
        while(i>=0){
            ans+=res[i];
            i--;
        }
        return ans;
    }
    private char[] solve(String num){
        char[] ans=num.toCharArray();
        int start=0;
        int end=ans.length-1;
        while(start<end){
            char temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
        return ans;
    }
}