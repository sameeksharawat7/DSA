class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //boyer morre
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i]!=ele1){
                ele2=nums[i];
                count2++;
            }
            else if(ele1==nums[i]){
                count1++;
            }
            else if(ele2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]){
                cnt1++;
            }
            if(ele2==nums[i]){
                cnt2++;
            }
        }
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        if(cnt1>n/3){
            res.add(ele1);
        }
        if(cnt2>n/3){
            res.add(ele2);
        }

        return res;

        // HashMap<Integer,Integer> res=new HashMap<>();
        // for(int num:nums){
        //     res.put(num,res.getOrDefault(num,0)+1);
        // }
        // List<Integer> ans = new ArrayList<>();
        // int n = nums.length;
        // for(int key:res.keySet()){
        //     if(res.get(key)>n/3){
        //         ans.add(key);
        //     }
        // }
        // return ans;
    }
}