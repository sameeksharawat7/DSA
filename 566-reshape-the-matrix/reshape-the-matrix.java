class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length)*(mat[0].length)!=r*c){
            return mat;
        }
        int[][] res=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int nindex=0;
        int oindex=0;
        while(nindex<r*c && oindex<m*n ){
            res[nindex/c][nindex%c]=mat[oindex/n][oindex%n];
            nindex++;
            oindex++;
        }
        return res;
    }
}