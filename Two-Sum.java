1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> num = new HashMap<Integer, Integer>();
4        for (int i = 0; i < nums.length; i++) {
5            if (num.containsKey(target - nums[i])) {
6                int[] arr = { num.get(target - nums[i]), i };
7                return arr;
8            }
9            num.put(nums[i], i);
10        }
11        return null;
12    }
13}