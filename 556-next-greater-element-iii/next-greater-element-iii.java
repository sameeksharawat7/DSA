class Solution {
    public int nextGreaterElement(int n) {
        char[] s=String.valueOf(n).toCharArray();
        int i=s.length-2;
        while(i>=0 && s[i]>=s[i+1]){
            i--;
        }
        if(i<0){
            return -1;
        }
        int j=s.length-1;
        while(s[j]<=s[i]){
            j--;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        reverse(s,i+1);
        try {
            return Integer.parseInt(new String(s));
            } 
        catch (NumberFormatException e) {
            return -1;
        }       
    }
    private void reverse(char[] s,int start){
        int end=s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}