class OptimisedSolution {

    //Source - https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/0
    //Tag - Linked List

    static Node segregate(Node head)
    {
        Node current = head;
        int[] count = new int[3];
        while(current != null){
            count[current.data]++;
            current = current.next;
        }
        current = head;
        int i = 0;
        while(current != null){
            if(count[i] == 0){
                i++;
            }else{
                current.data = i;
                count[i]--;
                current = current.next;
            }
        }
        return head;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)