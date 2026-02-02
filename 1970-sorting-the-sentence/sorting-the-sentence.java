class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] res = new String[words.length];
        for(String w:words){
            int pos=w.charAt(w.length()-1)-'1';
            res[pos]=w.substring(0,w.length()-1);
        }
        return String.join(" ",res);
    }
}