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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[count];
        int i=0;
        while(i<count){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr); 
        i=0;   
        temp=head;
        while(temp!=null){
            temp.val=arr[i];
            i++;
            temp=temp.next;
        }
        return head;
        
    }
}