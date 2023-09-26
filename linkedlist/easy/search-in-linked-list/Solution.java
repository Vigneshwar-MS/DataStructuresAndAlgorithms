class Solution {

    //Source - https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/0
    //Tag - Linked List

    static boolean searchKey(int n, Node head, int key) {
        while(head != null){
            if(head.data == key){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)