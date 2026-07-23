class Solution {

    public static String infixToPostfix(String s) {

        Stack<Character> stack = new Stack<>();
        String ans = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                ans += ch;
            }

            else if(ch == '(') {
                stack.push(ch);
            }

            else if(ch == ')') {

                while(!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }

                stack.pop(); // remove '('
            }

            else {

                while(!stack.isEmpty()
                        && stack.peek() != '('
                        && (
                             priority(stack.peek()) > priority(ch) ||
                            (priority(stack.peek()) == priority(ch) && ch != '^')
                         ))  {

                    ans += stack.pop();
                }

                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }

    public static int priority(char ch) {
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
}