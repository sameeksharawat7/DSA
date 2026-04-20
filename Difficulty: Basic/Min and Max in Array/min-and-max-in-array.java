class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int[] result = helper(arr, 0);
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(result[0]);
        res.add(result[1]); 
        
        return res;
    }
    private int[] helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return new int[]{arr[i], arr[i]}; // {min, max}
        }
        int max=arr[i];
        int min=arr[i];
        int[] res=helper(arr,i+1);
        max=Math.max(max,res[1]);
        min=Math.min(min,res[0]);

        return new int[]{min, max};
    }
}
