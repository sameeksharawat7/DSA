class Solution {
    public String removeConsecutiveCharacter(String s) {
        // Stack to store unique consecutive characters
        Stack<Character> st = new Stack<>();

        // Only pushing unique consecutive characters into the stack
        for (int i = 0; i < s.length(); i++) {
            if ((st.isEmpty() == false && st.peek() != s.charAt(i)) ||
                st.isEmpty() == true) {
                st.push(s.charAt(i));
            }
        }

        // Storing stack elements in a StringBuilder (more efficient than String
        // concatenation)
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Reversing the string since stack is LIFO (Last In First Out)
        return res.reverse().toString();
    }
}