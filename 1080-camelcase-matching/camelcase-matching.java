class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        for (String query : queries) {
            list.add(matches(query, pattern));
        }

        return list;
    }
    private boolean matches(String s,String pattern){
        int i=0;
        int j=0;
        while(i<s.length()){
            if(j<pattern.length() && pattern.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                if(Character.isUpperCase(s.charAt(i))){
                    return false;
                }
                else{
                    i++;
                }
            }
        }
        return j==pattern.length();
    }
}