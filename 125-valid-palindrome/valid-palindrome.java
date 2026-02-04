class Solution {
    public boolean isPalindrome(String s) {
    //     StringBuilder sb=new StringBuilder();
    //     int i=0;
    //     while(i<s.length()){
    //         if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
    //             sb.append((char)(s.charAt(i)+32));
    //             i++;
    //         }
    //         else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
    //             sb.append(s.charAt(i));
    //             i++;
    //         }
    //         else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
    //             sb.append(s.charAt(i));
    //             i++;
    //         }
    //         else{
    //             i++;
    //         }

    //     }
    //     return palindrome(sb);
    // }

    // public boolean palindrome(StringBuilder sb){
    //     int i=0;
    //     int j=sb.length()-1;
    //     while(i<j){
    //         if(sb.charAt(i)!=sb.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;

        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !isAlphanumeric(s.charAt(i))){
                i++;
            }
            while(i<j && !isAlphanumeric(s.charAt(j))){
                j--;
            }
            if(toLower(s.charAt(i))!=toLower(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphanumeric(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }

    public char toLower(char c){
        if(c>='A' && c<='Z'){
            return (char)(c+32);
        }
        return c;
    }
}