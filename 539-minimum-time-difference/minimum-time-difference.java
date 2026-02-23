class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            String time=timePoints.get(i);
            int hour=Integer.parseInt(time.substring(0,2));
            int min=Integer.parseInt(time.substring(3));
            arr[i]=hour*60+min;
        }
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
        }
        mindiff=Math.min(mindiff,1440-arr[n-1]+arr[0]);
        return mindiff;
    }
}