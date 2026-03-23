1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Map<Integer,Integer> num = new HashMap<Integer,Integer>();
4        for(int i=0;i<nums.length;i++) {
5            if(num.containsKey(nums[i])) {
6                return true;
7            }
8            num.put(nums[i],i);
9        }
10        return false;
11    }
12}