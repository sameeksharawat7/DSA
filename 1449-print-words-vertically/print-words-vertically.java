class Solution {
    public List<String> printVertically(String s) {
        String[] words=s.split(" ");
        int maxlen=0;
        for(String word:words){
            maxlen=Math.max(word.length(),maxlen);
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<maxlen;i++){
            StringBuilder sb = new StringBuilder();
            for(String word:words){
                if(i<word.length()){
                    sb.append(word.charAt(i));
                }
                else{
                    sb.append(" ");
                }
            }

            int end=sb.length()-1;
            while (end >= 0 && sb.charAt(end) == ' ') {
                end--;
            }
            result.add(sb.substring(0,end+1));
        }
        return result;
    }
}