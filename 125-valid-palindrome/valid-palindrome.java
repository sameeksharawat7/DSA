class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append((char)(s.charAt(i)+32));
                i++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(s.charAt(i));
                i++;
            }
            else{
                i++;
            }

        }
        return palindrome(sb);
    }

    public boolean palindrome(StringBuilder sb){
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}