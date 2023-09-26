class Solution {

    //Source - https://practice.geeksforgeeks.org/problems/introduction-to-linked-list/0
    //Tag - Linked List

    static Node constructLL(int arr[]) {
        Node head = null, current = null;
        for(int a : arr){
            if(head == null){
                head = current = new Node(a);
            }
            else{
                current.next = new Node(a);
                current = current.next;
            }
        }
        return head;
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)