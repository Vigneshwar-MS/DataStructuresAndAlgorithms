class Solution {

    //Source - https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/0
    //Tag - Linked List

    public static int getCount(Node head)
    {

        int count;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)