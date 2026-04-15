class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max=Math.max(max,i+1);
            }
            else if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return (max==Integer.MIN_VALUE)? 0 : max;
    }
    
}