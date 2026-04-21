class Solution {
    public List<String> letterCasePermutation(String s) {
        return build("",s);
    }
    List<String> build(String p,String up){
        if(up.length()==0){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch=up.charAt(0);
        if (Character.isDigit(ch)) {
            return build(p + ch, up.substring(1));
        }
        List<String> result=new ArrayList<>();
        result.addAll(build(p+Character.toLowerCase(ch),up.substring(1)));
        result.addAll(build(p+Character.toUpperCase(ch),up.substring(1)));
        return result;
    }
}