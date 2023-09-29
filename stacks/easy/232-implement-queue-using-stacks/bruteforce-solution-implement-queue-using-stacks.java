class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        
        return s1.pop();
    }
    
    public int peek() {
        
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

//Time Complexity is O(N) for push, O(1) for pop, peek and empty
//Space Complexity is O(2N) ~ O(N) as we use two stacks
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
