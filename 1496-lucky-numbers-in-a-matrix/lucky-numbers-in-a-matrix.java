class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            int mincol=0;
            for(int j=0;j<cols;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }
            boolean isLucky=true;
            for(int k=0;k<rows;k++){
                if(matrix[k][mincol]>matrix[i][mincol]){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky){
                res.add(matrix[i][mincol]);
            }
        }
        return res;
    }
}