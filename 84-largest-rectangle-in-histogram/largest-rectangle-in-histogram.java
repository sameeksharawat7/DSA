class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse=nsee(heights);
        int[] pse=pse(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        }
        return max;
    }
    private int[] pse(int[] nums) {
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
    private int[] nsee(int[] nums) {
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
}