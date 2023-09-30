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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        ListNode left = list1, right = list2;

        while(left != null && right != null){
            if(left.val == right.val){
                tail.next = left;
                ListNode nnodeLeft = left.next;
                left.next = null;
                tail = tail.next;
                left = nnodeLeft;

                tail.next = right;
                ListNode nnodeRight = right.next;
                right.next = null;
                tail = tail.next;
                right = nnodeRight;
            }
            else if(left.val < right.val){
                tail.next = left;
                ListNode nnodeLeft = left.next;
                left.next = null;
                tail = tail.next;
                left = nnodeLeft;
            }
            else{
                tail.next = right;
                ListNode nnodeRight = right.next;
                right.next = null;
                tail = tail.next;
                right = nnodeRight;
            }
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

//Time Complexity is O(M + N) where M, N are length of list1 and list2
//Space Complexity is O(M + N)













