class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask=0;
        for(char ch:allowed.toCharArray()){
            mask=mask | (1<<(ch-'a'));
        }
        int count=0;
        for(String word:words){
            boolean ans=true;
            for(char c:word.toCharArray()){
                if(((mask >>(c - 'a'))&1)==0){
                    ans=false;
                    break;
                }
            }
            if(ans){
                count++;
            }
        }
        return count;
    }
}