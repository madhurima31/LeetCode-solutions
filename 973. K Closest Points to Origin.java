/*
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
*/
class Solution {
    public int[][] kClosest(int[][] points, int K) {

        int[] distancesFromOrigin = new int[points.length];
        int[][] result = new int[K][2];
        int j=0;

        for(int i=0;i<points.length;i++){
            distancesFromOrigin[i]=Math.abs(points[i][0]*points[i][0]) + Math.abs(points[i][1]*points[i][1]);
        }

        int[] arr = new int[points.length];
          arr= distancesFromOrigin.clone();
         Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(K>0){
                int index = indexOf(arr[i],distancesFromOrigin);
                result[j][0]= points[index][0];
                result[j][1] = points[index][1];
                j++;
                K--;
            }
            else{
                break;
            }
        }
        return result;
    }

    public int indexOf(int x , int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return 0;
    }
}
