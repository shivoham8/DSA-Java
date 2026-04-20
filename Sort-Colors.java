1class Solution {
2    public void sortColors(int[] nums) {
3        int start = 0, mid = 0, end = nums.length - 1;
4        while (mid <= end) {
5            switch (nums[mid]) {
6                case 0:
7                    swap(nums, start, mid);
8                    mid++;
9                    start++;
10                    break;
11
12                case 1:
13                    mid++;
14                    break;
15
16                case 2:
17                    swap(nums, end, mid);
18                    end--;
19                    break;
20            }
21        }
22    }
23
24    private void swap(int[] nums, int pos1, int pos2) {
25        int temp = nums[pos1];
26        nums[pos1] = nums[pos2];
27        nums[pos2] = temp;
28    }
29}