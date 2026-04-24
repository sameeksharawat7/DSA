class Solution {
    public boolean isSorted(int[] arr) {
        return check(arr,1);
    }
    private boolean check(int[] arr,int i){
        if(i==arr.length){
            return true;
        }
        if(arr[i-1]>arr[i]){
            return false;
        }
        return check(arr,i+1);
    }
}