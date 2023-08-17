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
        ListNode result= new ListNode(0);
        int carry=0;
        ListNode ans= additionOf2LL(l1,l2,result,carry);
        return ans;
    }
    static ListNode additionOf2LL(ListNode l1,ListNode l2,ListNode result,int carry){
        int sum=0;
        if(l1== null && l2==null) {
            if(carry!=0) result.next= new ListNode(carry);
            return result;
        }
        if(l1 !=null) sum +=l1.val;
        if(l2 !=null) sum +=l2.val;
        sum += carry;
        result.next= new ListNode(sum%10);
        result=result.next;
        carry= sum/10;
        if(l1== null) additionOf2LL(l1, l2.next, result, carry);
        else if(l2==null) additionOf2LL(l1.next, l2, result, carry);
        else additionOf2LL(l1.next, l2.next, result, carry);
        return result;
    }
}