1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int expectedSum = (n * (n + 1)) / 2;
6        for (int i = 0; i < n; i++) {
7            sum += nums[i];
8        }
9        return expectedSum - sum;
10    }
11}