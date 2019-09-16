/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

// 使用异或XOR。异或有如下特点：x ^ 0 = x； x ^ x = 0。而且满足交换律。
// 所以我们直接生成1至n的数，全部XOR一遍，然后再把原数组的值都XOR一遍。
// 此时，所有在数组里出现过的数都XOR了两遍，根据交换律，得0；未出现的数只XOR了一遍，根据异或特点，此时异或的值就是缺失的数。

class Solution {
    public int missingNumber(int[] nums) {
        int b = 0;
        for (int i = 0; i <= nums.length; i++) b ^= i;
        for (int n: nums) b ^= n;
        return b;
    }
}