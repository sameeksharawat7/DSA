class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int ans=0;
        int start=0;
        int end=removable.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isSubsequence(s,p,removable,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    private boolean isSubsequence(String s,String p,int[] removable,int k){
        boolean[] removed= new boolean[s.length()];
        for(int i=0;i<k;i++){
            removed[removable[i]]=true;
        }

        int j=0;
        for(int i=0;i<s.length() && j<p.length();i++){
            if(!removed[i] && s.charAt(i)==p.charAt(j)){
                j++;
            }
        }
        return j==p.length();
    }
}