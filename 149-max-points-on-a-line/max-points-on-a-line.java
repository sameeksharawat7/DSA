class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n==1){
            return 1;
        }
        int result=0;
        for(int i=0;i<n;i++){
            HashMap<Double,Integer> map=new HashMap<>();
            for(int j=0;j<n;j++){
                if(i==j) continue;
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                double slope=Math.atan2(dy,dx);
                map.put(slope,map.getOrDefault(slope,0)+1);
            }
            for(int count:map.values()){
                result=Math.max(result,count+1);
            }
        }
        return result;
    }
}

//BRUTE FORCE

// class Solution {
//     public int maxPoints(int[][] points) {
//         int n = points.length;
//         if (n <= 2) return n;

//         int max = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {

//                 int count = 2; // i and j are already on line

//                 for (int k = 0; k < n; k++) {
//                     if (k == i || k == j) continue;

//                     int x1 = points[i][0], y1 = points[i][1];
//                     int x2 = points[j][0], y2 = points[j][1];
//                     int x3 = points[k][0], y3 = points[k][1];

//                     // check collinearity
//                     if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) {
//                         count++;
//                     }
//                 }

//                 max = Math.max(max, count);
//             }
//         }

//         return max;
//     }
// }
