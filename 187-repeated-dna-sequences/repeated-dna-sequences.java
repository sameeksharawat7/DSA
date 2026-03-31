class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       Map<String,Integer> freq=new HashMap<>();
       for(int i=0;i<s.length()-9;i++){
            String dna=s.substring(i,i+10);
            freq.put(dna,freq.getOrDefault(dna,0)+1);
       } 
       List<String> res=new ArrayList<>();
       for(Map.Entry<String,Integer> e :freq.entrySet()){
            if(e.getValue()>1){
                res.add(e.getKey());
            }
       }
       return res;
    }
}