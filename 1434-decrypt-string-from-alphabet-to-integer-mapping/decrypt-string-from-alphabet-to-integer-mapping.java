class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans= new StringBuilder();
        int n=s.length();
        int i=0;
        while(i<n){
            if(i+2<n && s.charAt(i+2)=='#'){
                int num=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
                ans.append((char)('a'+ num-1));
                i=i+3;
            }
            else{
                int num=s.charAt(i)-'0';
                ans.append((char)('a'+ num-1));
                i=i+1;
            }
        }
        return ans.toString();
    }
}