/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currentA = headA;
        ListNode currentB = headB;
        
        while(currentA != currentB){
            if(currentA == null){
                currentA = headB;
            }
            else{
                currentA = currentA.next;
            }

            if(currentB == null){
                currentB = headA;
            }
            else{
                currentB = currentB.next;
            }
        }

        return currentA;
    }

}
//Time complexity is O(M + N), where M is the length of linked list A and B is the length of linked list B
//Space complexity is O(1)
