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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       
        ListNode odd=head;
        ListNode even=head.next;
        ListNode odd1=new ListNode(head.val);
        ListNode temp=odd1;
        ListNode even1=new ListNode(head.next.val);
        ListNode temp1=even1;
        while(odd.next!=null && odd.next.next!=null){
            odd=odd.next.next;
            ListNode A=new ListNode(odd.val);
            odd1.next=A;
            odd1=odd1.next;
            
        }
        
        while(even.next!=null && even.next.next!=null){
            even=even.next.next;
            ListNode B=new ListNode(even.val);
            even1.next=B;
            even1=even1.next;
        }
        odd1.next=temp1;
        return temp;
    }
}