class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            if(freq[i]==0) {
                continue;
            }
            for(int j=i+1;j<101;j++){
                if(freq[j]==0){
                    continue;
                }
                if(freq[i]!=freq[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}