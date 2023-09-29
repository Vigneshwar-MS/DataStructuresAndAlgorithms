class MinStack {

    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    Stack<Pair> stack = new Stack<>();
    int min;

    public MinStack() {
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stack.empty() == true){
            stack.push(new Pair(val, val));
            return;
        }
        int curMin = stack.peek().y;
        if(curMin > val){
            curMin = val;
        }
        stack.push(new Pair(val, curMin));
    }
    
    public void pop() {
        if(stack.empty() == false) stack.pop();
    }
    
    public int top() {
        if(stack.empty() == false){
            return stack.peek().x;
        }
        return -1;
    }
    
    public int getMin() {
        if(stack.empty() == false){
            return stack.peek().y;
        }
        return -1;
    }
}

//Time complexity is O(N) on the whole and O(1) for push, pop, top and getMin
//Space complexity is O(N)

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */