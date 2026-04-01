class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> temp=new HashSet<>();
        while(n!=1 && !temp.contains(n)){
            temp.add(n);
            n=squareSum(n);
        }
        return n==1;
    }
    private int squareSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum + (rem*rem) ;
            n=n/10;
        }
        return sum;
    }
}