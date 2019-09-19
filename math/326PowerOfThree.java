/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

*/

class Solution {
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n, 3).matches("10*");
    }
}