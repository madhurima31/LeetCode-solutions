/*

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8


*/
class Solution {
    public int missingNumber(int[] nums) {
        int xor1=nums[0];
        int xor2 = 0;
        for(int i=1;i<nums.length;i++){
         xor1= xor1 ^ nums[i];
        }
        for(int i=1;i<nums.length+1;i++){
            xor2 = xor2 ^ i;
        }

        return xor1 ^ xor2 ;
    }
}
