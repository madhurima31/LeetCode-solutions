/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(hm.get(nums1[i])!=null)
                hm.put(nums1[i],hm.get(nums1[i])+1);
            else
                hm.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.get(nums2[i])!=null && hm.get(nums2[i])!=0){
                al.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }

        int[] arr = new int[al.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = al.get(i);
        }
        return arr ;
    }
}
