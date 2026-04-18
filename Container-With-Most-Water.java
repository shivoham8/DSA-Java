1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int maxWater = 0;
5        while (left < right) {
6            int currWater = Math.min(height[left], height[right]) * (right - left);
7            maxWater = Math.max(maxWater, currWater);
8            if (height[left] < height[right]) {
9                left++;
10            } else {
11                right--;
12            }
13        }
14        return maxWater;
15    }
16}