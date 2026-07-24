class Solution {
    static String preToPost(String s) {
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            else{
                String s1=stack.pop();//B
                String s2=stack.pop();//A
                String n=s1+s2+ch;
                stack.push(n);
            }
        }
        return stack.pop();
    }
}