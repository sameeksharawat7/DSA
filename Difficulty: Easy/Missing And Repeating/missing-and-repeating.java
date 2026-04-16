class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        long n=arr.length;
        long Sn=(n*(n+1))/2;
        long S2n=(n*(n+1)*(2*n+1))/6;
        long s=0;
        long s2=0;
        for(int num:arr){
            s+=num;
            s2+=(long)num*(long)num;
        }
        
        long val1=s-Sn;//x-y
        long val2=s2-S2n;
        val2=val2/val1;//x+y
        long x=(val1+val2)/2;
        long y=x-val1;
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int)x);
        result.add((int)y);
        return result;
    }
}
