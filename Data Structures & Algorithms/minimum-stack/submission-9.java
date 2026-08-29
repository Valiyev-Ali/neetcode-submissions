class MinStack {

    Deque<Integer> currMin;
    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        currMin = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (currMin.isEmpty() || val < currMin.peek()) {
            currMin.push(val);
        }
        else {
            currMin.push(currMin.peek());
        }
        stack.push(val);
    }
    
    public void pop() {
            currMin.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if (currMin.isEmpty()) {
            return 0;
        }
        return currMin.peek();
    }
}
