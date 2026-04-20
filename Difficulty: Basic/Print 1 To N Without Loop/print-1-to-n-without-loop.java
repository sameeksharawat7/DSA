class Solution {
    public void printNos(int n) {
        print(n,1);
    }
    private void print(int n,int i){
        if(i>n){
            return;
        }
        System.out.print(i +" ");
        print(n,i+1);
    }
}
