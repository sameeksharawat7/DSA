class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] check=new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(check[ch-'a']==0){
                check[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(check[i]==0){
                return false;
            }
        }
        return true;
    }
}