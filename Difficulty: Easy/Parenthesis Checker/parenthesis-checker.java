class Solution {
    public boolean isBalanced(String s) {
        return helper(s.toCharArray(), 0, s.length() - 1);
    }

    private boolean helper(char[] s, int start, int end) {
        if (start > end) return true;
        if (start == end) return false;

        if (s[start] == ')' || s[start] == '}' || s[start] == ']') {
            return false;
        }

        char opening = s[start];
        char closing = findClosing(opening);

        int count = 0;
        int i;

        for (i = start; i <= end; i++) {
            if (s[i] == opening) count++;
            if (s[i] == closing) count--;

            if (count == 0) break;
        }

        if (i > end) return false;

        return helper(s, start + 1, i - 1) &&
               helper(s, i + 1, end);
    }

    private char findClosing(char c) {
        if (c == '(') return ')';
        if (c == '{') return '}';
        if (c == '[') return ']';
        return '#';
    }
}
