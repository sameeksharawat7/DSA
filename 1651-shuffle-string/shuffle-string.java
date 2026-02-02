class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[s.length()];
        char[] s1=s.toCharArray();
        for(int i=0;i<s.length();i++){
            ans[indices[i]]=s1[i];
        }
        return new String(ans);
    }
}