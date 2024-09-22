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
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        tail.next=head;
        int i=1;
        ListNode temp=head;
        while(i<len-k){
            temp=temp.next;
            i++;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }

}