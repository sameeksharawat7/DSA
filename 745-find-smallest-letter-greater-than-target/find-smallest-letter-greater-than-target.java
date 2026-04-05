class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //done
        int start=0;
        int end=letters.length-1;
        char ans=letters[0];
        if(target>=letters[end]){
            return ans;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]>target) {
                ans=letters[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}