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

        while(headA != null){
            ListNode currentB = headB;
            while(currentB != null){
                if(headA == currentB){
                    return headA;
                }
                currentB = currentB.next;
            }
            headA = headA.next;
        }   
        return null;
    }
}
//Time complexity is O(M*N), where M is the length of linked list A and B is the length of linked list B
//Space complexity is O(1)
