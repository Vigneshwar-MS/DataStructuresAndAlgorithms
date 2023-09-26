class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/0
    //Tag - Linked List

    public static Node reverseDLL(Node  head)
    {
        if(head == null || head.next == null){
            head.prev = null;
            return head;
        }

        Node nnode = reverseDLL(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return nnode;
    }
}

//Recursive Solution
// Time Complexity is O(N)
//Space Complexity is O(1)