1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int count = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
6                continue;
7            } else {
8                nums[count] = nums[i];
9                count++;
10            }
11        }
12        return count;
13    }
14}