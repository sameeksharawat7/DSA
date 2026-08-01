import java.util.*;

class Solution {

    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    private long sumMin(int[] nums) {
        int n = nums.length;

        int[] pse = previousSmaller(nums);
        int[] nse = nextSmallerEqual(nums);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            ans += left * right * (long) nums[i];
        }

        return ans;
    }

    private long sumMax(int[] nums) {
        int n = nums.length;

        int[] pge = previousGreater(nums);
        int[] nge = nextGreaterEqual(nums);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pge[i];
            long right = nge[i] - i;

            ans += left * right * (long) nums[i];
        }

        return ans;
    }

    private int[] previousSmaller(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i])
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] nextSmallerEqual(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i])
                st.pop();

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] previousGreater(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i])
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] nextGreaterEqual(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i])
                st.pop();

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }
}