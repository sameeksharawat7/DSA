class Solution {
    public int[] countBits(int n) {
        int[] result=new int[n+1];
        for(int i=0;i<result.length;i++){
            result[i]=countSetBit(i);
        }
        return result;
    }
    private int countSetBit(int a){
        int count=0;
        while(a>0){
            a=a&(a-1);
            count++;
        }
        return count;
    }
}