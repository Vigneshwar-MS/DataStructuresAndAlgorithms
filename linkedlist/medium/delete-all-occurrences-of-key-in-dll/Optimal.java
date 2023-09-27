class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/0
//    Tag - Doubly Linked List easy level


    static Node deleteAllOccurOfX(Node head, int x) {
        if(head == null) return null;

        Node current = head;
        while(current != null){
            if(current.data == x){
                if(current.prev == null){
                    head = head.next;
                }
                else if(current.next == null){
                    current.prev.next = current.next;
                }
                else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }
        return head;
    }

}

//Time Complexity is O(N)
//Space complexity is O(1)
