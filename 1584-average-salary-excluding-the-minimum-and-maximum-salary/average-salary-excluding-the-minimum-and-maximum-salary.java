class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int count=0;
        long sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
            count++;
        }
        return (double) sum/count;
    }
}