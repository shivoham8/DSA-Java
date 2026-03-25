1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for (char ch : s.toCharArray()) {
5            if (ch == '(' || ch == '{' || ch == '[') {
6                st.push(ch);
7            } else {
8                if (st.isEmpty()) {
9                    return false;
10                }
11                char top = st.pop();
12                if (top == '(' && ch != ')' ||
13                        top == '{' && ch != '}' ||
14                        top == '[' && ch != ']') {
15                    return false;
16                }
17            }
18        }
19        return st.isEmpty();
20    }
21}