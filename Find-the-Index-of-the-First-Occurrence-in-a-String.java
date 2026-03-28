1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = haystack.length();
4        int m = needle.length();
5
6        for (int i = 0; i <= n - m; i++) {
7            if (haystack.charAt(i) == needle.charAt(0)) {
8                String subStr = haystack.substring(i, i + m);
9                if (subStr.equals(needle)) {
10                    return i;
11                }
12            }
13        }
14        return -1;
15    }
16}