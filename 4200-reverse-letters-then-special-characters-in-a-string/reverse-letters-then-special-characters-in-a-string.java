class Solution {
    public String reverseByType(String s) {
        int l=0;
        int sp=0;
        int len=s.length();
        char[] reverse=new char[len];
        StringBuilder letter=new StringBuilder();
        StringBuilder character=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i>='a' && i<='z'){
                letter.append(i);
            }
            else{
                character.append(i);
            }
        }
        letter.reverse();
        character.reverse();
        for(int j=0;j<len;j++){
            char c=s.charAt(j);
            if(c>='a' && c<='z'){
                reverse[j]=letter.charAt(l++);
            }
            else{
                reverse[j]=character.charAt(sp++);
            }
        }
        return new String(reverse);
        
    }
}