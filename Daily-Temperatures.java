1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] ans = new int[n];
5        Deque<Integer> st = new ArrayDeque<>();
6
7        for (int i = 0; i < n; i++) {
8            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
9                int prevIndex = st.pop();
10                ans[prevIndex] = i - prevIndex;
11            }
12            st.push(i);
13        }
14        return ans;
15    }
16}