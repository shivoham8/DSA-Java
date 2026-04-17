1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0, maxSum = nums[0];
4        for (int i = 0; i < nums.length; i++) {
5            sum += nums[i];
6            if (sum > maxSum) {
7                maxSum = sum;
8            }
9            if (sum < 0) {
10                sum = 0;
11            }
12        }
13        return maxSum;
14    }
15}