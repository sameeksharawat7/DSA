class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            int calc=arr[i]-arr[i-1];
            if(calc!=diff){
                return false;
            }
        }
        return true;
    }
}