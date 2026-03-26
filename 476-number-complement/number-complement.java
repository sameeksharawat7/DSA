class Solution {
    public int findComplement(int num) {
        int bits=(int)(Math.log(num)/Math.log(2))+1;
        int mask=(1<<bits)-1;
        return num^mask;
    }
}