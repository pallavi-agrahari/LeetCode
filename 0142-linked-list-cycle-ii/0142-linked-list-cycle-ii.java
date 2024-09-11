/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        // ListNode temp=head;
        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
        if(isCycle==false){
            return null;
        }
        slow=head;
        while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
        } 
        
        return slow;
       
        
    }
}