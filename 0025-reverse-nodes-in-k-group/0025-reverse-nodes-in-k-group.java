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
    public ListNode findKthNode(ListNode head, int k){
        int i=1;
        while(head!=null && i<k){
            head=head.next;
            i++;
        }
        return  head;
    }
    // ListNode findKthNode(ListNode head, int k){
    //     k-=1;
    //     while(head!=null && k>0){
    //         k--;
    //         head=head.next;
    //     }
    //     return head;
    // }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
         } 
        ListNode temp=head;
        ListNode newhead=reverse(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        head.next=null;
        return newhead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp, k);
            if(kthNode==null){
               if(prevNode!=null)
               prevNode.next=temp;
               break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else prevNode.next=kthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;

    }
}