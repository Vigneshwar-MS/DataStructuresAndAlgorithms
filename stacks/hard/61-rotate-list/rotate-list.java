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
        if(head == null|| head.next == null ||k == 0) {
            return head;
        }
        int len = findLength(head);
        k = k % len;
        if(k == 0) {
            return head;
        }

        ListNode first = head, second = head;
        while(k > 0){
            second = second.next;
            k--;
        }

        while(second != null && k == 0 && second.next != null){
            first = first.next;
            second = second.next;
        }
        ListNode nnode = first.next;
        first.next = null;
        second.next = head;
        return nnode;

    }

     private static int findLength(ListNode head){
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
}