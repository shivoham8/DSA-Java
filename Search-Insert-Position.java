1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int start = 0, end = nums.length - 1;
4        while (start <= end) {
5            int mid = (end - start) / 2 + start;
6            if (target < nums[mid]) {
7                end = mid - 1;
8            } else if (target > nums[mid]) {
9                start = mid + 1;
10            } else {
11                return mid;
12            }
13        }
14        return start;
15    }
16}