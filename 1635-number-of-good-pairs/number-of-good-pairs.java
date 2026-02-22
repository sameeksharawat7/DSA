class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            goodPairs += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }
}