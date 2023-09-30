/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> container= new HashSet<ListNode>();
        ListNode cur=headA;
        while(cur!=null){     
            container.add(cur);
            cur=cur.next;
        }
        
        cur=headB;
        while(cur!=null){
            if(container.contains(cur)) return cur;
            cur=cur.next;
        }
    
    return null;
    }
}