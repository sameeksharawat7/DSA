class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    private boolean check(String a,String b){
        int l=0;
        int r=b.length()-1;
        while(l<r && a.charAt(l)==b.charAt(r)){
            l++;
            r--;
        }
        if(l>=r){
            return true;
        }
        return isPalindrome(a,l,r) || isPalindrome(b,l,r);
    }
    private boolean isPalindrome(String a, int l,int r){
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}