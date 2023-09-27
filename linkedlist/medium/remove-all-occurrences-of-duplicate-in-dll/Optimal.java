class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/0
//    Tag - Doubly Linked List easy level


    Node removeDuplicates(Node head){
        Node current = head;
        while(current.next != null){

            if(current.data == current.next.data){
                if(current.next.next != null){
                    current.next = current.next.next;
                    current.next.prev = current;
                }
                else{
                    current.next = null;
                }
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

}

//Time Complexity is O(N)
//Space complexity is O(1)
