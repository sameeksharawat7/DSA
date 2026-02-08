class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum=new int[gain.length+1];
        sum[0]=0;
        int ans=0;
        for(int i=0;i<gain.length;i++){
            ans = ans + gain[i];
            sum[i + 1] = ans;
        }
        return max(sum);

    }
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}