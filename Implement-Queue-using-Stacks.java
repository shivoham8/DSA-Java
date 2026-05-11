1class MyQueue {
2    private Stack<Integer> st1;
3    private Stack<Integer> st2;
4
5    public MyQueue() {
6        st1 = new Stack<>();
7        st2 = new Stack<>();
8    }
9
10    public void push(int x) {
11        st2.push(x);
12    }
13
14    public int pop() {
15        peek();
16        return st1.pop();
17    }
18
19    public int peek() {
20        if (st1.isEmpty()) {
21            while (!st2.isEmpty()) {
22                st1.push(st2.pop());
23            }
24        }
25        return st1.peek();
26    }
27
28    public boolean empty() {
29        return (st1.isEmpty() && st2.isEmpty());
30    }
31}
32
33/**
34 * Your MyQueue object will be instantiated and called as such:
35 * MyQueue obj = new MyQueue();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.peek();
39 * boolean param_4 = obj.empty();
40 */