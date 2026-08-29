class MinStack {

    Deque<Integer> currMin;
    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        currMin = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty() || val < currMin.peek()) {
            currMin.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek() == currMin.peek()) {
            currMin.pop();
        }
        stack.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if (currMin.isEmpty()) {
            return 0;
        }
        return currMin.pop();
    }
}
