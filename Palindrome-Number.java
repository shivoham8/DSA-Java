1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x >= 0 && x < 10) {
4            return true;
5        }
6        if (x < 0 || x % 10 == 0) {
7            return false;
8        }
9        int ans = 0;
10        while (x > ans) {
11            ans = (ans * 10) + x % 10;
12            x /= 10;
13        }
14        return ans == x || ans / 10 == x;
15    }
16}