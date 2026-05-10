1class MyStack {
2    private Queue<Integer> q1;
3    private Queue<Integer> q2;
4    public MyStack() {
5        q1 = new LinkedList<>();
6        q2 = new LinkedList<>();
7    }
8
9    public void push(int x) {
10        while (!q1.isEmpty()) {
11            q2.add(q1.remove());
12        }
13        q1.add(x);
14        while (!q2.isEmpty()) {
15            q1.add(q2.remove());
16        }
17    }
18
19    public int pop() {
20        return q1.remove();
21    }
22
23    public int top() {
24        return q1.peek();
25    }
26
27    public boolean empty() {
28        return q1.isEmpty();
29    }
30}
31
32/**
33 * Your MyStack object will be instantiated and called as such:
34 * MyStack obj = new MyStack();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.top();
38 * boolean param_4 = obj.empty();
39 */