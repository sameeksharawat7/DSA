/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndex(mountainArr);
        int firstTry=binarysearch(mountainArr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return binarysearch(mountainArr,target,peak+1,mountainArr.length()-1);
    }
    public int peakIndex(MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int binarysearch(MountainArray mountainArr,int target,int start,int end){
        boolean isAsc=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(isAsc){
                if (mountainArr.get(mid)>target) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (mountainArr.get(mid)<target) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}