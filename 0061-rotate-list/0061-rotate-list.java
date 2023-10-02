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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next== null) return head;
        ListNode cur=head;
        int len=1;
        ListNode temp=null;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
       //System.out.println(cur.val);
       //System.out.println(len);
        cur.next=head;
    //System.out.println(cur.next.val);
        
        if(k>= len) k=k%len;
        
        int null_pointer=len-k;
        while(null_pointer >0){
            if(null_pointer==1) temp=head;
            null_pointer=null_pointer-1;
            head= head.next;
            
        }
        temp.next=null;
        //System.out.println(temp.val);
        return head;
    }
}