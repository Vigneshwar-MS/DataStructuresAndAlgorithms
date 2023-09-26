class Solution {

    //Source - https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0
    //Tag - Linked List

    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node current = head;

        if(current == null){
            head = current = new Node(x);
        }
        else{
            while(current.next != null){
                current = current.next;
            }

            current.next = new Node(x);
            current = current.next;
        }

        return head;
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)