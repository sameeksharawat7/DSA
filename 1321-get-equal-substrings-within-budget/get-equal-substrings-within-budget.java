class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start=0;
        int len=0;
        int sum=0;
        for(int end=0;end<s.length();end++){
            sum=sum+Math.abs(s.charAt(end) - t.charAt(end));
            while(sum>maxCost){
                sum=sum-Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            len=Math.max(len,end-start+1);
        }
        return len;
    }
}