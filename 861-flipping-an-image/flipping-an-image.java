class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int n=image.length;
        // int[][] temp=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         temp[i][j]=1-(image[i][n-1-j]);
        //     }
        // }
        // return temp;


        //approach2
        for(int[] row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[image[0].length-1-i]^1;
                row[image[0].length-1-i]=temp;
            }
        }
        return image;
    }
}