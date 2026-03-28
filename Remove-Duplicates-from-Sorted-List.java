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
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null) {
14            return head;
15        }
16        ListNode prev = head, curr = head.next;
17        while (curr != null) {
18            if (prev.val == curr.val) {
19                prev.next = curr.next;
20                curr = curr.next;
21            } else {
22                prev = curr;
23                curr = curr.next;
24            }
25        }
26        return head;
27    }
28}