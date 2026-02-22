class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        int totalshifts=0;
        char[] arr=s.toCharArray();
        for(int i=n-1;i>=0;i--){
            totalshifts=(totalshifts+shifts[i])%26;
            arr[i]=(char)('a'+(arr[i]-'a'+totalshifts)%26);
        }
        return new String(arr);
    }
}