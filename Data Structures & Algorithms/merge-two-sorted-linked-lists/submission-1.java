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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2;
        }

        else if(list2==null){
            return list1;
        }
        
        ListNode dummyNode=new ListNode(-1);
        ListNode dummy=dummyNode;

        ListNode curr1=list1;

        ListNode curr2=list2;

        while(curr1!=null && curr2!=null){

            if(curr1.val <=curr2.val){
                dummy.next=curr1;
                curr1=curr1.next;
               
           }
           else{   
            dummy.next=curr2;
            curr2=curr2.next;
            }
             dummy=dummy.next;

           
           

        }

        if(curr1!=null){
             dummy.next=curr1;
             curr1=curr1.next;
        }

        if(curr2!=null){
             dummy.next=curr2;
             curr2=curr2.next;
        }
        return dummyNode.next;
    }
}