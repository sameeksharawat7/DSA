class Solution {
    public boolean isPerfectSquare(int num) {
        boolean ans= false;
       if(num==0 || num==1){
            return true;
        }
        int start=1;
        int end=num;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid ==num/mid && num % mid == 0){
                ans=true;
                return ans;
            }
            else if(mid>num/mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;  
    }
}