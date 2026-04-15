1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        reverse(nums, 0, n - 1);
6        reverse(nums, 0, k - 1);
7        reverse(nums, k, n - 1);
8    }
9
10    public static void reverse(int[] nums, int start, int end) {
11        while (start <= end) {
12            int temp = nums[start];
13            nums[start] = nums[end];
14            nums[end] = temp;
15            start++;
16            end--;
17        }
18    }
19}