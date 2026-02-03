class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(isSubstringPresent(word,patterns[i])){
                count++;
            }
        }
        return count;
    }

    public boolean isSubstringPresent(String word ,String p){
        int n=word.length();
        int m=p.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && word.charAt(i+j)==p.charAt(j)){
                j++;
            }
            if(j==m){
                return true;
            }
        }
        return false;
    }
}