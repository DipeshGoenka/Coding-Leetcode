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
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        Stack<Integer> s = new Stack<>();
        while(cur != null){
            s.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            int top = s.pop();
            if(cur.val != top){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
}