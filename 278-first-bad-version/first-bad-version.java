/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans=-1;
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            boolean b=isBadVersion(mid);
            if(b){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}