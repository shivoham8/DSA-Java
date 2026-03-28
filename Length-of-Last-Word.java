1class Solution {
2    public int lengthOfLastWord(String s) {
3        String str = s.trim();
4        int count = 0;
5        for (int i = str.length() - 1; i >= 0; i--) {
6            if (str.charAt(i) != ' ') {
7                count++;
8            } else {
9                break;
10            }
11        }
12        return count;
13    }
14}