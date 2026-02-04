class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        int i=0;
        int j=0;
        while(j<m){
            if(i<n && name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && typed.charAt(j-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        return i==n;
    }
}