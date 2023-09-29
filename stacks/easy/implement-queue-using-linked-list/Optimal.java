class BruteForce {

//    Source of the problem - https://www.codingninjas.com/studio/problems/implement-queue-using-linked-list_8161235
//    Tag - Stack Easy level


    class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };

    class Queue{
        Node front;
        Node rear;
        void push(){};
        Queue() {
            front = null;
            rear = null;
        }
    }

 *****************************************************************/

    public class Solution extends Queue{
        public void push(int x) {
            Node nnode = new Node(x);

            if(front == null){
                front = rear = nnode;
                return;
            }

            rear.next = nnode;
            rear = nnode;
        }

        public int pop() {

            if(front == null){
                return -1;
            }

            int val = front.data;

            if(front == rear){
                front = rear = null;
                return val;
            }
            front = front.next;
            return val;

        }
    }

//Time Complexity is O(N) for the whole stack and every operation push, pop, getTop, getSize, isEmpty is O(1)
//Space complexity is O(N)
