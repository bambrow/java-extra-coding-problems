/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/


public class Solution {
    public String reverseString(String s) {
        
        char[] rev = s.toCharArray();

        for (int i = 0, j = rev.length - 1; i <= j; ++i, --j) {
            char temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
        }
        
        return String.valueOf(rev);
        
    }
}