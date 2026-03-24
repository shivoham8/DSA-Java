1class Solution {
2    public int value(char c) {
3        if (c == 'I') {
4            return 1;
5        } else if (c == 'V') {
6            return 5;
7        } else if (c == 'X') {
8            return 10;
9        } else if (c == 'L') {
10            return 50;
11        } else if (c == 'C') {
12            return 100;
13        } else if (c == 'D') {
14            return 500;
15        } else {
16            return 1000;
17        }
18    }
19
20    public int romanToInt(String s) {
21        int ans = 0;
22        int prev = -1;
23        int n = s.length();
24        for (int i = n - 1; i >= 0; i--) {
25            int curr = value(s.charAt(i));
26            if (prev != -1 && curr < prev) {
27                ans -= curr;
28            } else {
29                ans += curr;
30            }
31            prev = curr;
32        }
33        return ans;
34    }
35}