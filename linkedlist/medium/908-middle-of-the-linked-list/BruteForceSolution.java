class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/0
    //Tag - Linked List

    int getMiddle(Node head)
    {
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        int find = 0;
        current = head;
        while(find < count / 2){
            find++;
            current = current.next ;
        }
        return current.data;
    }
}

// Time Complexity is O(N + N/2)
// Space Complexity is O(1)