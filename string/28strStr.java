/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (hLen < nLen) return -1;
        if (nLen == 0) return 0;
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            for ( ; j < nLen; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
            }
            if (j == nLen) return i;
        }
        return -1;
    }
}