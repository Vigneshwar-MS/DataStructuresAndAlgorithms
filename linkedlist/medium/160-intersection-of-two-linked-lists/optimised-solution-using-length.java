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

        int countA = findLengthofNode(currentA);
        int countB = findLengthofNode(currentB);
        if(countA > countB){
            int diff = countA - countB;
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        else if(countB > countA){
            int diff = countB - countA;
            while(diff > 0){
                headB = headB.next;
                diff--;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    int findLengthofNode(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
//Time complexity is O(M+N), where M is the length of linked list A and B is the length of linked list B
//Space complexity is O(1)
