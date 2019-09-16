/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/

// 0的来源是2*5。注意25=5*5，它与两个2相乘可以得两个0。125同理可以得3个0。
// 所以问题就是找到因子2和因子5的数量。2比5多得多，所以变成了找因子5的数量。
// 答案很明显：num = n/5 + n/25 + n/125 + n/625 + ...
// 相当于：   num = n/5 + n/(5*5) + n/(5*5*5) + ...
// 所以写一个循环即可。

class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }
}