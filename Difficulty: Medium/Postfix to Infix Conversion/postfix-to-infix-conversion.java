class Solution {
    static String postToInfix(String exp) {
        Stack<String> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                s.push(ch + "");
            }
            else{
                String s1=s.pop();//B
                String s2=s.pop();//A
                String n="("+s2+ch+s1+")";
                s.push(n);
            }
        }
        return s.pop();
    }
}
