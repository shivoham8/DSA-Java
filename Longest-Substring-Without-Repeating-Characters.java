1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0, right = 0;
4        int result = 0;
5        Map<Character, Integer> map = new HashMap<>();
6        while (right < s.length()) {
7            char c = s.charAt(right);
8            if (map.containsKey(c)) {
9                left = Math.max(left, map.get(c) + 1);
10            }
11            map.put(c, right);
12            result = Math.max(result, right - left + 1);
13            right++;
14        }
15        return result;
16    }
17}