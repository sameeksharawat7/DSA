class Solution {
    public int heightChecker(int[] heights) {
        int[] count=new int[101];
        for(int height:heights){
            count[height]++;
        }
        int index=0;
        int result=0;
        for(int i=0;i<101;i++){
            while(count[i]>0){
                if(heights[index]!=i){
                    result++;
                }
                index++;
                count[i]--;
            }
        }
        return result;
    }
}