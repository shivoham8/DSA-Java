1class Solution {
2    public int majorityElement(int[] nums) {
3        // Moore's Voting Algorithm
4        int freq = 0, ans = 0;
5        for (int i = 0; i < nums.length; i++) {
6            if (freq == 0) {
7                ans = nums[i];
8            }
9            if (ans == nums[i]) {
10                freq++;
11            } else {
12                freq--;
13            }
14        }
15        return ans;
16    }
17}