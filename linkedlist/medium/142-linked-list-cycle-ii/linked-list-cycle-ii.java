/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
           ListNode first = head, second = head;
           while(second != null && second.next != null){
               first = first.next;
               second = second.next.next;

               if(first == second){
                   break;
               }
           }
           if(second == null || second.next == null) return null;

           ListNode temp = head;
           while(temp != first){
               temp = temp.next;
               first = first.next;
           }
           return temp;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)