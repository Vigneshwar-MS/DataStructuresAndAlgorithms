class BruteForceSolution {

    //Source - https://leetcode.com/problems/linked-list-cycle/description/
    //Tag - Linked List

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while(head != null){

            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)
