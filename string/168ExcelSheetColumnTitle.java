/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/

// 简单题。使用了StringBuilder并不断在最前面插入新字符。

class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            n--;
            s.insert(0, (char)('A'+n%26));
            n/=26;
        }
        return s.toString();
    }
}