class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res=new int[encoded.length+1];
        res[0]=first;
        int i=1;
        for(int num:encoded){
            res[i]=num^res[i-1];
            i++;
        }
        return res;
    }
}