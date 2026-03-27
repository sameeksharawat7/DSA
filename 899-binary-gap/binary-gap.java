class Solution {
    public int binaryGap(int n) {
        int maxdist=0;
        int last=-1;
        int index=0;
        while(n>0){
            if((n&1)==1){
                if(last!=-1){
                    maxdist=Math.max(maxdist,index-last);
                }
                last=index;
            }
            n=n>>1;
            index++;
        }
        return maxdist;
    }
}