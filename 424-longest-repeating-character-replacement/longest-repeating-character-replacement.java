class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxfreq=0;
        int maxlen=0;
        int[] temp=new int[26];
        while(r<s.length()){
            temp[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,temp[s.charAt(r)-'A']);
            if((r-l+1)-maxfreq >k){
                temp[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}