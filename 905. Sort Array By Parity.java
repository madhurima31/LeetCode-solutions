/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i=0;
        int j= A.length -1;
        while(i<j){
            if(A[i]%2 > A[j]%2){        // 1 > 0 i.e A[i] is odd and A[j] is even
                int temp = A[i];
                A[i] =A[j];
                A[j]= temp;
            }

            if(A[i]%2==0)
                i++;
            if(A[j]%2==1)
                j--;
        }
        return A;
    }
}
