/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

// 双指针查找。

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while (i<j) {
            int value = numbers[i] + numbers[j];
            if (value == target) {
                break;
            } else if (value < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {i+1, j+1};
    }
}