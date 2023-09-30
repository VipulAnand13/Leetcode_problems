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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=null;
        ListNode head=null;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1==null) sum=l2.val+carry;
            else if(l2== null) sum= l1.val+carry;
            else sum=l1.val + l2.val + carry;
            if(dummy==null) {
                dummy=new ListNode(sum%10);
                head=dummy;
            }
            else{
                 dummy.next=new ListNode(sum%10);
                dummy=dummy.next;
            }
            carry=sum/10;
            sum=0;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
           
        }
        if(carry>0) dummy.next=new ListNode(carry);
        return head;
    }
}