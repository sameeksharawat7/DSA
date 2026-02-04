class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        while(col>0){
            int r=(col-1)%26;
            sb.append((char)(r+'A'));
            col=(col-1)/26;
        }
        
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}