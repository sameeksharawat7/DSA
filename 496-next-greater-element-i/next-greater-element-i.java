class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int a=nums2[i];
            // if(s.isEmpty()){
            //     s.push(a);
            //     map.put(a,-1);
            //    continue;
            // }
            // else if(s.peek()>a){
            //     map.put(a,s.peek());
            //     s.push(a);
            //     continue;
            // }
            while(!s.isEmpty() && s.peek()<=a){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(a,-1);
            }
            else{
                map.put(a,s.peek());
            }
            s.push(a);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}