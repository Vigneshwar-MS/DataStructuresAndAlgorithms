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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode first = head, second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        
        ListNode prev = null;
        while(first != null){
            ListNode next = first.next;
            first.next = prev;
            prev = first;
            first = next;
        }

        while(head != null && prev != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)
