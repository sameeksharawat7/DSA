class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return pad("",digits);
    }
    List<String> pad(String p,String up){
        if(up.isEmpty()){
           List<String> res=new ArrayList<>();
           res.add(p);
           return res; 
        }
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        int digit=up.charAt(0)-'0';
        String letters=map[digit];

        List<String> result = new ArrayList<>();

        for(char ch:letters.toCharArray()){
            result.addAll(pad(p+ch,up.substring(1)));
        }
        return result;
    }
}