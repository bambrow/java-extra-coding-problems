/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

*/

// 简单题。原数组已排序，需要移除重复元素。
// 方法与27类似。使用i标记移除重复元素后的当前下标。
// 用j从位置1遍历数组，并且与i位置的值比较。如果不同，证明遇到了一个新数，那么将数值复制到i的下一个位置。
// 最后i+1的数值就是新数组的长度。

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) continue;
            nums[++i] = nums[j];
        }
        return i+1;
    }
}