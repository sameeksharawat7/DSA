class Solution {
    int[] countGreater(int arr[], int indices[]) {
        int[] ans=new int[indices.length];
        for(int i=0;i<indices.length;i++){
            int idx=indices[i];
            int count=0;
            for(int j=idx+1;j<arr.length;j++){
                if(arr[idx]<arr[j]){
                    count++;
                }
                
            }
            ans[i]=count;
        }
        return ans;
    }
}
