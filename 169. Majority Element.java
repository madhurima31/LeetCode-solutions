/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length ;i++){
            int count = 0;
            if(countMap.get(nums[i])!=null){
            count= countMap.get(nums[i]);
            }
            countMap.put(nums[i],count+1);
        }
        int maxcount = 0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(countMap.get(nums[i])>maxcount){
                maxcount= countMap.get(nums[i]);
                result = nums[i];
            }
        }
        return result;
    }
}