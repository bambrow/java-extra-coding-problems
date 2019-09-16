/*
Implement int sqrt(int x).

Compute and return the square root of x.
*/

// 使用二分查找。具体见答案。

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int lo = 1, hi = x, ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (x/mid >= mid) {
                lo = mid + 1;
                ans = mid;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}