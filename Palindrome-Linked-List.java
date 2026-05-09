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
12    public boolean isPalindrome(ListNode head) {
13        if (head == null || head.next == null) {
14            return true;
15        }
16        ListNode slow = head;
17        ListNode fast = head;
18        while (fast != null && fast.next != null) {
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        slow = reverse(slow);
23        ListNode start = head;
24        ListNode end = slow;
25        while (end != null) {
26            if (start.val != end.val) {
27                return false;
28            }
29            start = start.next;
30            end = end.next;
31        }
32        return true;
33    }
34
35    public ListNode reverse(ListNode head) {
36        ListNode prev = null;
37        ListNode curr = head;
38        while (curr != null) {
39            ListNode next = curr.next;
40            curr.next = prev;
41            prev = curr;
42            curr = next;
43        }
44        return prev;
45    }
46}