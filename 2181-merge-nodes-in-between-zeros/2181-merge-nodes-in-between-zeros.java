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
    public ListNode mergeNodes(ListNode head) {
        ListNode nn=new ListNode(0);
        ListNode n=nn;
        ListNode t=head.next;
        int sum=0;
        while(t!=null){
            if(t.val==0){
                n.next=new ListNode(sum);
                n=n.next;
                sum=0;
                t=t.next;
            }
            else{
            sum+=t.val;
            t=t.next;
            }
        }
        return nn.next;
    }
}