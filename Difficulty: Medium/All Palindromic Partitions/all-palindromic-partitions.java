class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> result =new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void backtrack(String s,int start,ArrayList<String> path,ArrayList<ArrayList<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(path));
            return ;
        }
        for(int i=start;i<s.length();i++){
            if(isPalindrome(s,start,i)){
                path.add(s.substring(start,i+1));
                backtrack(s,i+1,path,result);
                path.remove(path.size()-1);
            }
        }
    }
}
