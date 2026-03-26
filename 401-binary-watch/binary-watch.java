class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        for(int h=0;h<=11;h++){
            for(int m=0;m<=59;m++){
                if(setBit(h)+setBit(m)==turnedOn){
                    String hour=String.valueOf(h);
                    String minutes=(m<10?"0":"")+m;
                    result.add(hour+":"+minutes);
                }
            }
        }
        return result;
    }
    private int setBit(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}