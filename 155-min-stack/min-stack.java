class MinStack {
    Stack<Integer> stack;
    Stack<Integer> temp=new Stack<>();
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(value);
            temp.push(value);
        }
        else{
            stack.push(value);
            if(value<temp.peek()){
                temp.push(value);
            }
            else{
                temp.push(temp.peek());
            }
        }
    }
    
    public void pop() {
        stack.pop();
        temp.pop();
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