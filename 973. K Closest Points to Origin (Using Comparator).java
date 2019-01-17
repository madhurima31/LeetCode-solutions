// Optimised solution

/*
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
*/
class Solution {
    public int[][] kClosest(int[][] points, int K) {

        Arrays.sort(points,new Comparator<int[]>(){

           public int compare(int[] p1, int[] p2){
               return Integer.compare(p1[0]*p1[0] + p1[1]*p1[1], p2[0]*p2[0] + p2[1]*p2[1] );
           }
        });

        int result[][] = new int[K][2];
        for(int i=0;i<K;i++){
            result[i][0]=points[i][0];
            result[i][1]= points[i][1];
        }
        return result;
    }
}
