1class Solution {
2    public int mySqrt(int x) {
3        long start = 0;
4        long end = x;
5        long ans = 0;
6        while (start <= end) {
7            long mid = (end - start) / 2 + start;
8            if (mid * mid == x) {
9                return (int)mid;
10            } else if (mid * mid < x) {
11                start = mid + 1;
12                ans = mid;
13            } else {
14                end = mid - 1;
15            }
16        }
17        return (int)ans;
18    }
19}