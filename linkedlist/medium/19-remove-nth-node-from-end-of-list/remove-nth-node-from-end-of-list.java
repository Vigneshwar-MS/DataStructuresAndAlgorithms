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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode();
      dummy.next = head;
      ListNode second = dummy, first = dummy;
      while(second.next != null && n > 0){
          second = second.next;
          n--;
      }     

      if(second.next == null){
          dummy.next = dummy.next.next;
          return dummy.next;
      }

      while(second.next != null){
          first = first.next;
          second = second.next;
      }
      first.next = first.next.next;
      return dummy.next;


    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)