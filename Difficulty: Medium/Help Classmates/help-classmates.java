class Solution {
    public static int[] help_classmate(int arr[], int n) {
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }
}
