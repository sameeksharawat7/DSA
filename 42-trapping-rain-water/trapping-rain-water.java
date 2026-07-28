class Solution {
    public int trap(int[] height) {
        int lm=0;
        int rm=0;
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            if(height[l]>lm){
                lm=height[l];
            }
            if(height[r]>rm){
                rm=height[r];
            }
            if(lm<rm){
                ans+=lm-height[l];
                l++;
            }
            else{
                ans+=rm-height[r];
                r--;
            }
        }
        return ans;
    }
}