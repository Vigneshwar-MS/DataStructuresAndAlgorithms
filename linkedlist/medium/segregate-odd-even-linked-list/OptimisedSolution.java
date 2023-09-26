class OptimisedSolution {

    //Source - https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/0
    //Tag - Linked List

    Node divide(int N, Node head){
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node current = head;
        while(current != null){
            if(current.data % 2 == 0){
                if(evenStart == null){
                    evenStart = current;
                    evenEnd = evenStart;
                    current = current.next;
                    evenEnd.next =null;
                }else{
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                    current = current.next;
                    evenEnd.next =null;
                }
            }else{
                if(oddStart == null){
                    oddStart = current;
                    oddEnd = oddStart;
                    current = current.next;
                    oddEnd.next =null;
                }else{
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                    current = current.next;
                    oddEnd.next =null;
                }
            }

        }
        if(evenStart == null) return oddStart;
        if(oddStart == null) return evenStart;
        evenEnd.next = oddStart;
        return evenStart;

    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)