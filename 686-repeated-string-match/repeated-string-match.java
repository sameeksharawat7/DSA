class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        StringBuilder temp= new StringBuilder(a);
        while(temp.length()<b.length()){
            count++;
            temp.append(a);
        }
        if(temp.toString().contains(b)){
            return count;
        }
        temp.append(a);
        count++;
        if(temp.toString().contains(b)){
            return count;
        }
        return -1;
    }
}