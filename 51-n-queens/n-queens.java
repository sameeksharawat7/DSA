class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queen(board,0);
    }
    private List<List<String>> queen(boolean[][] board,int row){
        if(row==board.length){
            List<List<String>> list=new ArrayList<>();
            list.add(display(board));
            return list;
        }
        List<List<String>> temp=new ArrayList<>();
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                temp.addAll(queen(board,row+1));
                board[row][col]=false;
            }
        }
        return temp;
    }
    private boolean isSafe(boolean[][] board,int row,int col){
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxright=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    private List<String> display(boolean[][] board){
        List<String> temp=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
            temp.add(sb.toString());
        }
        return temp;
    }

}