class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/0
//    Tag - Hashing Easy level


    public static Node addOne(Node head)
    {
        Node current = reverse(head);
        head = current;
        int carry = 1;
        while(current != null){

            int sum = current.data + carry;
            carry = sum / 10;
            current.data = sum % 10;
            current = current.next;
        }

        current = reverse(head);
        if(carry == 1){
            Node temp = new Node(carry);
            temp.next = current;
            return temp;
        }
        else{
            return current;
        }

    }

    static Node reverse(Node head){
        Node current = head, prev = null;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}

//Time Complexity is O(N)
//Space complexity is O(1)
