class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public boolean check(int[][] arr1,int[][] arr2){
        if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate(int[][] arr1){
        //transpose
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1[i].length;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        int start=0;
        int end=arr1.length-1;
        while(start<=end){
            for(int i=0;i<arr1.length;i++){
                int temp=arr1[i][start];
                arr1[i][start]=arr1[i][end];
                arr1[i][end]=temp;
            }
            start++;
            end--;
        }
    }
}