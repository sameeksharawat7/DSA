class Solution {
    public void reverseString(char[] s) {
        recursiveReverse(s,0,s.length-1);
    }
    void recursiveReverse(char[] s,int i,int j){
        if(i>j){
            return;
        }
        swap(s,i,j);
        recursiveReverse(s,i+1,j-1);
    } 
    void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    } 
}