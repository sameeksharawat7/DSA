class Solution {
    public void reverseString(char[] s) {
        recursiveReverse(s,0,s.length-1);
    }
    void recursiveReverse(char[] s,int i,int j){
        if(i>=j){
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        recursiveReverse(s,i+1,j-1);
    }  
}