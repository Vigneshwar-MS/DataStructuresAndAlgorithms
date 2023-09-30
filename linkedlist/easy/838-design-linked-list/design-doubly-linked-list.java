class MyLinkedList {

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int a){  data = a; next = null; prev = null; }
    }

    Node left;
    Node right;

    public MyLinkedList() {
        left = new Node(0);
        right = new Node(0);
        left.next = right;
        right.prev = left;
    }
    
    public int get(int index) {
        
        Node current = left.next;
        while(current != null && index > 0){
            current = current.next;
            index--;
        }
        if(current != null && current != right && index == 0){
            return current.data;
        }
        return -1;

    }
    
    public void addAtHead(int val) {
        
        Node current = left.next;
        Node temp = new Node(val);
        left.next = temp;
        temp.prev = left;
        temp.next = current;
        current.prev = temp;

    }
    
    public void addAtTail(int val) {
        Node current = right.prev;
        Node temp = new Node(val);
        current.next = temp;
        temp.prev = current;
        temp.next = right;
        right.prev = temp;
    }
    
    public void addAtIndex(int index, int val) {
        Node current = left.next;
        while(current != null && index > 0){
            current = current.next;
            index--;
        }
        if(current != null && index == 0){
            Node temp = new Node(val);
            
            Node next = current;
            Node prev = current.prev;

            prev.next = temp;
            next.prev = temp;
            temp.prev = prev;
            temp.next = next;
            
        }
    }
    
    public void deleteAtIndex(int index) {
        Node current = left.next;
        while(current != null && index > 0){
            current = current.next;
            index--;
        }
        if(current != null && current != right && index == 0){
            Node next = current.next;
            Node prev = current.prev;
            next.prev = prev;
            prev.next = next;
            
        }
        
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
