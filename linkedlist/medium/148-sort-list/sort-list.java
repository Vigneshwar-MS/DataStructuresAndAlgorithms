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
        
        if(head == null || head.next == null){
            return head;
        }

        ListNode left = head;
        ListNode right = getMiddle(left);

        ListNode temp = right.next;
        right.next = null;
        right = temp;
        left = sortList(left);
        right = sortList(right);

        return mergeList(left, right);

    }

    public ListNode getMiddle(ListNode head){
        ListNode first = head, second = head;
        while(second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    public ListNode mergeList(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(left != null && right != null){
            if(left.val <= right.val){
                tail.next = left;
                left = left.next;
            }
            else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left != null){
            tail.next = left;
        }
        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }   
}

//Time complexity is O(N logN)
//Space complexity is O(log N) for recursive stack

     




