/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).
*/

class Solution {
    public int fib(int N) {
        if(N==0){
            return 0;
        }
        else if(N==1){
            return 1;
        }
        int[] arr = new int[N+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=N;i++){
            arr[i]=arr[i-1]+arr[i-2];
            if(i==N){
                return arr[N];
            }
        }
        return 0;
    }
}
