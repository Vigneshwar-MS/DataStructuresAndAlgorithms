class BruteForce {

//    Source of the problem - https://www.codingninjas.com/studio/problems/implement-queue-using-arrays_8390825
//    Tag - Stack Easy level


    class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if(front == rear){
                front = 0;
                rear = 0;
            }
            arr[rear++] = e;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if(front == rear){
                return -1;
            }
            return arr[front++];
        }
    }
}

//Time Complexity is O(1)
//Space complexity is O(N)
