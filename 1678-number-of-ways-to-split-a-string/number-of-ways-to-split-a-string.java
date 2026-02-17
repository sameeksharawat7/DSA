class Solution {
    int MOD=(int)Math.pow(10,9)+7;
    public int numWays(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        if(count%3 != 0){
            return 0;
        }
        if(count==0){
            long len=s.length();
            return (int)((len-1)*(len-2)/2 % MOD);
        }

        int onesPerGroup=count/3;
        int counter=0;
        long firstblock=0; 
        long secondblock=0;
        for(char letter:s.toCharArray()){
            if(letter=='1'){
                counter++;
            }
            if(counter==onesPerGroup){
                firstblock++;
            }
            else if(counter==2*onesPerGroup){
                secondblock++;
            }
        }


        return(int)(firstblock*secondblock % MOD);
    }
}