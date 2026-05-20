1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] ans = new int[nums1.length];
4        Deque<Integer> st = new ArrayDeque<>();
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int i = nums2.length - 1; i >= 0; i--) {
7            while (!st.isEmpty() && nums2[i] >= st.peek()) {
8                st.pop();
9            }
10            if (st.isEmpty()) {
11                map.put(nums2[i], -1);
12            } else {
13                map.put(nums2[i], st.peek());
14            }
15            st.push(nums2[i]);
16        }
17        for (int i = 0; i < nums1.length; i++) {
18            ans[i] = map.get(nums1[i]);
19        }
20        return ans;
21    }
22}