/*
Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

*/

class Solution {
    public int smallestRangeI(int[] A, int K) {

        int min=A[0], max=A[0];
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }

        return Math.max(0,max-min-2*K);
    }
}
