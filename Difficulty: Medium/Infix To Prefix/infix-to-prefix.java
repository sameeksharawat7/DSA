class Solution {
    static String infixToPrefix(String s) {
        String r = new StringBuilder(s).reverse().toString();
        Stack<Character> stack = new Stack<>();
        String ans = "";
        char[] arr = r.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '('){
                arr[i] = ')';}
            else if (arr[i] == ')'){
                arr[i] = '(';}
        }

r = new String(arr);

        for(int i = 0; i < r.length(); i++) {

            char ch = r.charAt(i);

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
                        // && stack.peek() != '('
                        && (
                             priority(stack.peek()) > priority(ch) ||
                            (priority(stack.peek()) == priority(ch) && ch == '^')
                         ))  {

                    ans += stack.pop();
                }

                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        String reversed = new StringBuilder(ans).reverse().toString();
        return reversed;
    }

    public static int priority(char ch) {
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
}