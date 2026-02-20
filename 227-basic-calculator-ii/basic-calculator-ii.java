class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num=0;
        char operator='+';
        for(int i=0;i<s.length();i++){
            char charvalue=s.charAt(i);
            if(Character.isDigit(charvalue)){
                num=(num*10)+(charvalue-'0');
            }
            if((!Character.isDigit(charvalue) && charvalue!=' ') || (i==s.length()-1)){
                if(operator=='+'){
                    stack.push(num);
                }
                if(operator=='-'){
                    stack.push(-1*num);
                }
                if(operator=='*'){
                    stack.push(num*stack.pop());
                }
                if(operator=='/'){
                    stack.push(stack.pop()/num);
                }
                num=0;
                operator=charvalue;
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum=sum+stack.pop();
        }
        return sum;
    }
}