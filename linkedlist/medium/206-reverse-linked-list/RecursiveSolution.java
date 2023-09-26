class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/0
    //Tag - Linked List

    Node reverseList(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

        Node nnode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return nnode;
    }
}

//Recursive Solution
// Time Complexity is O(N)
//Space Complexity is O(1)