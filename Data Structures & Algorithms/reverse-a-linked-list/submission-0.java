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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr=head;
        ListNode pvs=null;

        while(curr!=null){

            ListNode tempNode=curr.next;
            curr.next=pvs;
            pvs=curr;

            curr=tempNode;
        }
        return pvs;
    }
}
