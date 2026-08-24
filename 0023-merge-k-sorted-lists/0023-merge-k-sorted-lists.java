/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
            ArrayList<Integer> a = new ArrayList<>();

        for (ListNode l : lists)
            while (l != null) {
                a.add(l.val);
                l = l.next;
            }

        java.util.Collections.sort(a);

        ListNode d = new ListNode(0), c = d;

        for (int x : a) {
            c.next = new ListNode(x);
            c = c.next;
        }

        return d.next;
    }
}