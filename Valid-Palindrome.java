1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
4        int left = 0, right = s.length() - 1;
5        while (left <= right) {
6            if (s.charAt(left) != s.charAt(right)) {
7                return false;
8            }
9            left++;
10           right--;
11        }
12        return true;
13    }
14}
