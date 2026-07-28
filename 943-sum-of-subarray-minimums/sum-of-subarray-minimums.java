class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse=findNSE(arr);
        int[] psee=findPSEE(arr);
        long total = 0;
        int MOD = 1000000007;
        for(int i=0;i<arr.length;i++){
            long left=i-psee[i];
            long right=nse[i]-i;
            long contribution = left * right * arr[i];
            total = (total + contribution) % MOD;
        }
        return (int)total;
    }
    private int[] findPSEE(int[] arr){
        int[] psee=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                psee[i]=-1;
            }
            else{
                psee[i]=stack.peek();
            }
            stack.push(i);  
        }
        return psee;
    }

    private int[] findNSE(int[] arr){
        int[] nse=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[i]=arr.length;
            }
            else{
                nse[i]=stack.peek();
            }
            stack.push(i);
        }
        return nse;
    }
}