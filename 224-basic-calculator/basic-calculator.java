class Solution {
    public int calculate(String s) {
        //stack question
        Stack<Integer> stack = new Stack<>();
        int num=0;
        int sign=1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
                ans=ans+num*sign;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                ans=ans+num*sign;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                stack.push(ans);
                stack.push(sign);
                ans=0;
                sign=1;
            }
            else if(ch==')'){
                ans=ans+num*sign;
                num=0;

                ans=ans*stack.pop();
                ans=ans+stack.pop();
            }
        }
        ans=ans+num*sign;
        return ans;
    }
}