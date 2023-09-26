class BruteForceSolution {

    //Source - https://practice.geeksforgeeks.org/problems/find-length-of-loop/0
    //Tag - Linked List

    static int countNodesinLoop(Node head)
    {
        Set<Node> set = new HashSet<>();
        Node first = head, temp = null;

        while(first != null){

            if(set.contains(first)){
                temp = first;
                break;
            }
            set.add(first);
            first = first.next;
        }
        if(first == null) return 0;

        Node current = temp;
        int count = 1;
        current = current.next;
        while(temp != current){
            count++;
            current = current.next;
        }

        return count;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)