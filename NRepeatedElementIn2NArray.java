/*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.

 */
 class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet();
        int result=A[0];
        for(int a : A){
            if(!set.add(a)){
                return a;
            }
        }

    return 0;
    }
}
