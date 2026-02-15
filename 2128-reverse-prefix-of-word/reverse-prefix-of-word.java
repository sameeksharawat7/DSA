class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                reverse(arr,0,i);
                break;
            }
        }
        return new String(arr);
    }
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}