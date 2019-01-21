/*
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]

*/



class Solution {
    public int[] diStringMatch(String S) {
        int N=S.length();
        int highValue = N;
        int lowValue = 0;
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='I'){
                arr[i]= lowValue;
                lowValue++;
            }
            else {
                arr[i]= highValue;
                highValue--;
            }
        }
        arr[N] = lowValue;
      return arr;
    }
}
