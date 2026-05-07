1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        int[] count = new int[26];
7        for (char c : s.toCharArray()) {
8            count[c - 'a']++;
9        }
10        for (char c : t.toCharArray()) {
11            count[c - 'a']--;
12            if (count[c - 'a'] < 0) {
13                return false;
14            }
15        }
16        return true;
17    }
18}