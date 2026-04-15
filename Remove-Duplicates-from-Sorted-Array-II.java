1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int count = 0;
4        for(int element : nums) {
5            if(count < 2 || element != nums[count-2]) {
6                nums[count++] = element;
7            }
8        }
9        return count;
10    }
11}