class MinStack {
    Stack<Integer> stack;
    Stack<Integer> temp=new Stack<>();
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(temp.isEmpty() || value<=temp.peek()){
            temp.push(value);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(temp.peek())){
            temp.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return temp.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */