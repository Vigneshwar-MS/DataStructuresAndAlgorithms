class RecursiveSolution {

    //Source - https://leetcode.com/problems/linked-list-cycle-ii/
    //Tag - Linked List

    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)