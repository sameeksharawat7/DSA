class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int low = 0, high = n;
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(s, t, maxCost, mid)) {
                answer = mid;     // mid length possible
                low = mid + 1;    // try bigger
            } else {
                high = mid - 1;   // try smaller
            }
        }

        return answer;
    }

    private boolean isValid(String s, String t, int maxCost, int len) {
        int n = s.length();
        int cost = 0;

        // first window of size len
        for (int i = 0; i < len; i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));
        }

        if (cost <= maxCost) return true;

        // slide the window
        for (int i = len; i < n; i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            cost -= Math.abs(s.charAt(i - len) - t.charAt(i - len));

            if (cost <= maxCost) return true;
        }

        return false;
    }
}