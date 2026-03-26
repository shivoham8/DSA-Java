1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int count = 0;
4        for(int i=0;i<nums.length;i++) {
5            if(nums[i]!=val) {
6                nums[count] = nums[i];
7                count++;
8            } 
9        }
10        return count;
11    }
12}