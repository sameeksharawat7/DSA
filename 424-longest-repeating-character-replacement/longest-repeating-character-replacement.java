class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxfreq=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));
            if((r-l+1)-maxfreq >k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}