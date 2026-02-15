class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seenzeroafterone=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                seenzeroafterone=true;
            }
            else{
                if(seenzeroafterone){
                    return false;
                }
            }
        }
        return true;
    }
}