class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/0
    //Tag - Linked List

    public static Node reverseDLL(Node  head)
    {
        Node prev = null, current = head;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        return prev;
    }
}

//Recursive Solution
// Time Complexity is O(N)
//Space Complexity is O(1)