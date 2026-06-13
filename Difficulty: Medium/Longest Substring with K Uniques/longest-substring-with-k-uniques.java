class Solution {
    public int longestKSubstr(String s, int k) {
        int maxlen=-1;
        int l=0;
        int r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size()>k){
                char ch1=s.charAt(l);
                map.put(ch1, map.get(ch1) - 1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                }
                l=l+1;
            }
            if(map.size()==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}