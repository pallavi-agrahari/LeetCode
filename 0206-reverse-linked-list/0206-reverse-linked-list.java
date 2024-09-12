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
        
        //Approach 1 
        /*Stack<Integer> st=new Stack<>();

        while(current!=null){
            st.push(current.val);
            current=current.next;
        }
        current=head;
        while(current!=null){
            current.val=st.pop();
            current=current.next;
        }
        return head;*/

        // Approach2
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode front=current.next;
            current.next=prev;
            prev=current;
            current=front;
            // current.next=prev;
        }
        return prev;
        
    }
}