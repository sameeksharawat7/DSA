class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(!list.contains(sentence.charAt(i))){
                list.add(c);
            }
        }
         return list.size()==26;
    }
}