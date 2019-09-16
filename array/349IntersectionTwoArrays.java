/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        
        for (int k : nums1) nums.add(k);
        for (int k : nums2) if (nums.contains(k)) intersect.add(k);
        
        int[] res = new int[intersect.size()];
        int i = 0;
        for (Integer m : intersect) res[i++] = m;
        return res;
        
    }
}