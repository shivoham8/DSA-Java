1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode head = dummy;
15        int carry = 0;
16        while (l1 != null || l2 != null) {
17            int sum = carry;
18            if (l1 != null) {
19                sum += l1.val;
20                l1 = l1.next;
21            }
22            if (l2 != null) {
23                sum += l2.val;
24                l2 = l2.next;
25            }
26            head.next = new ListNode(sum % 10);
27            head = head.next;
28            carry = sum / 10;
29        }
30        if (carry != 0) {
31            head.next = new ListNode(carry, null);
32        }
33        return dummy.next;
34    }
35}