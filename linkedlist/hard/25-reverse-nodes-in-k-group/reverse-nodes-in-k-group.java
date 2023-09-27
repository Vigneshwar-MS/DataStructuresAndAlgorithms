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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int len = findLength(current);

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode leftPrev = dummy;
        current = head;
        
        while(len >= k){
            ListNode prev = null;
            int count = k;
            while(count > 0 && current != null){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count--;
            }
            ListNode nnode = leftPrev.next;
            leftPrev.next.next = current;
            leftPrev.next = prev;
            leftPrev = nnode;
            len -= k;
        }
        return dummy.next;
    }

    int findLength(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)