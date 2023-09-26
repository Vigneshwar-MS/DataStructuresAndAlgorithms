class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/find-length-of-loop/0
    //Tag - Linked List

    static int countNodesinLoop(Node head)
    {
        Node first = head, second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;

            if(first == second){
                break;
            }
        }
        if(second == null || second.next == null) return 0;

        Node temp = head;
        while(temp != first){
            temp = temp.next;
            first = first.next;
        }
        int count = 1;
        temp = temp.next;
        while(temp != first){
            count++;
            temp = temp.next;
        }

        return count;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(1)