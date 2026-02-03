class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(String w : words){
            char[] arr = w.toCharArray();
            int left = 0, right = arr.length - 1;

            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            ans.append(new String(arr)).append(" ");
        }

        return ans.toString().trim();
    }
}
