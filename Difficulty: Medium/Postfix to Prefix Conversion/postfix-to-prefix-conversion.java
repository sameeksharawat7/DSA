class Solution {
    static String postToPre(String s) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            else{
                String s1=stack.pop();//B
                String s2=stack.pop();//A
                String n=ch+s2+s1;
                stack.push(n);
            }
        }
        return stack.pop();
        
    }
}
