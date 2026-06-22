class Solution {
    public String minWindow(String s1, String s2) {
        int i=0;
        int m=s1.length();
        int n=s2.length();
        int minLen=Integer.MAX_VALUE;
        int start=-1;
        while(i<m){
            int j=0;
            while(i<m){
                if(s1.charAt(i)==s2.charAt(j)){
                    j++;
                    if(j==n) break;
                }
                i++;
            }
            if(i==m) break;
            
            int end=i;
            j=n-1;
            while(j>=0){
                if(s1.charAt(i)==s2.charAt(j)){
                    j--;
                }
                i--;
            }
            i++;
            if(end-i+1<minLen){
                minLen=end-i+1;
                start=i;
            }
            i=i+1;
        }
        return start==-1 ? "" :s1.substring(start, start + minLen);
    }
}
