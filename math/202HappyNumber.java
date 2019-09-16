/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

// 最原始的方法是使用HashSet来存储每一步的计算值。这种计算只能出现两种结果：1，或者N个数无限循环。
// 因此如果发现某个数在HashSet里已经有了，就可以返回false了。
// 但其实也可以不用HashSet，使用类似链表快慢指针的方法，维护两个变量p和q，p一次算一步，q一次算两步。
// 如果存在上面的无限循环，那么p和q总有一天会相等，而且均不为1。

class Solution {
    public boolean isHappy(int n) {
        int p = n, q = n;
        while (p > 1) {
            p = convert(p);
            q = convert(q);
            q = convert(q);
            if (p == 1 || q == 1) return true;
            if (p == q) return false;
        }
        return true;
    }
    
    private int convert(int n) {
        int s = 0;
        while (n > 0) {
            int j = n % 10;
            n /= 10;
            s += j * j;
        }
        return s;
    }
}

// 彩蛋：其实我写了个程序看看这东西到底有几种可能的值，发现只有两种：收敛为1，或者在[4 16 37 58 89 145 42 20]这几个数里无限循环。所以下面的代码也可以通过（微笑脸）

class Solution {
    public boolean isHappy(int n) {
        int p = n;
        while (p > 1) {
            if (p == 4) return false;
            p = convert(p);
        }
        return true;
    }
    
    private int convert(int n) {
        int s = 0;
        while (n > 0) {
            int j = n % 10;
            n /= 10;
            s += j * j;
        }
        return s;
    }
}

