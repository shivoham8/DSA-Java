1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        int index = 0;
5        while (index < strs[0].length()) {
6            if (strs[0].charAt(index) == strs[strs.length - 1].charAt(index)) {
7                index++;
8            } else {
9                break;
10            }
11        }
12        return index == 0 ? "" : strs[0].substring(0, index);
13    }
14}