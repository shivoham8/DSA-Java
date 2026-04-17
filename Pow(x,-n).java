1class Solution {
2    public double myPow(double x, int n) {
3        if(n == 0) {
4            return 1;
5        }
6        if(n == 1) {
7            return x;
8        }
9        long N = n;
10        if (N < 0) {
11            x = 1 / x;
12            N = -N;
13        }
14        double result = 1;
15        while (N != 0) {
16            if (N % 2 == 1) {
17                result *= x;
18            }
19            x *= x;
20            N /= 2;
21        }
22        return result;
23    }
24}