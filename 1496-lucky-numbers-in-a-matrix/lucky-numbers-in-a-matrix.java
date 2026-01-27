class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> maxcol=new ArrayList<>();
        ArrayList<Integer> minrow=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            int min=matrix[i][0];
            for(int j=0;j<cols;j++){
                min=Math.min(min,matrix[i][j]);
            }
            minrow.add(min);
        }
        for(int i=0;i<cols;i++){
            int max=matrix[0][i];
            for(int j=0;j<rows;j++){
                max=Math.max(max,matrix[j][i]);
            }
            maxcol.add(max);
        }
        for (int i = 0; i < maxcol.size(); i++) {
            for (int j = 0; j < minrow.size(); j++) {
                if (maxcol.get(i).equals(minrow.get(j))) {
                    res.add(maxcol.get(i));
                }
            }
        }
        return res;
    }
}