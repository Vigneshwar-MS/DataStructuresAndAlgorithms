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

        while(list1 != null && list2 != null){
            if(list1.val == list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;

                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
            else if(list1.val < list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            tail.next = list1;
        }

        if(list2 != null){
            tail.next = list2;
        }

        return dummy.next;
    }
}

//Time Complexity is O(M + N) where M, N are length of list1 and list2
//Space Complexity is O(M + N)













