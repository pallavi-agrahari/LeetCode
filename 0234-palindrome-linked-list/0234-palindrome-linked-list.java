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
    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
            if (head == null || head.next == null) {
            return true;  // A list with 0 or 1 node is always a palindrome
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode second = reverseList(slow.next);

        // Step 3: Compare the first and the second half
        ListNode firstHalf = head;
        ListNode secondHalf = second;  // To restore the list later

        while (secondHalf!= null) {
            if (firstHalf.val != secondHalf.val) {
                reverseList(second);
                return false;  
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}