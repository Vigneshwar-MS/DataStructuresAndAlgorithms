class BruteForce {

//    Source of the problem - https://www.codingninjas.com/studio/problems/stack-implementation-using-array_3210209
//    Tag - Stack Easy level


    static class Stack {
        int[] arr;
        int pos;
        Stack(int capacity) {
            arr = new int[capacity];
            pos = -1;
        }
        public void push(int num) {
            if(pos < arr.length - 1){
                arr[++pos] = num;
            }
        }
        public int pop() {
            if(pos == -1){
                return -1;
            }
            int val = arr[pos--];
            return val;
        }
        public int top() {
            if(pos == -1){
                return -1;
            }
            return arr[pos];
        }
        public int isEmpty() {
            if(pos == -1){
                return 1;
            }
            return 0;
        }
        public int isFull() {
            if(pos == arr.length - 1){
                return 1;
            }
            return 0;
        }
    }
}

//Time Complexity is O(N)
//Space complexity is O(N)
