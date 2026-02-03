class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr={0,0};//{x,y}
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U'){
                arr[1]+=1;
            }
            else if(c=='D'){
                arr[1]-=1;
            }
            else if(c=='R'){
                arr[0]+=1;
            }
            else if(c=='L'){
                arr[0]-=1;
            }
        }
        return arr[0]==0 && arr[1]==0;    
        }
}