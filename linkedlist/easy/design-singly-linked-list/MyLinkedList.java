class MyLinkedList {


    class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }

    Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        int count = 0;
        Node current = head;
        while(current != null){
            if(count == index) return current.data;
            current = current.next;
            count++;
        }
        return -1;

    }

    public void addAtHead(int val) {
        if(head == null){
            head = new Node(val);
        }
        else{
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        if(head == null){
            head = new Node(val);
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(val);
            current = current.next;
        }
    }

    public void addAtIndex(int index, int val) {
        int length = lengthOfList();
        if(index > length) return;

        int count = 0;
        Node current = head;
        Node prev = null;

        while(count < index){
            prev = current;
            current = current.next;
            count++;
        }
        if(prev == null){
            Node temp = new Node(val);
            temp.next = current;
            head = temp;
            return;
        }
        Node temp = new Node(val);
        prev.next = temp;
        temp.next = current;
    }

    public void deleteAtIndex(int index) {

        if(lengthOfList() <= index){
            return;
        }
        if(head == null) return;
        if(index == 0){
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 0;
        while(count < index){
            prev = current;
            current = current.next;
            count++;
        }

        prev.next = current.next;
    }

    private int lengthOfList(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
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
