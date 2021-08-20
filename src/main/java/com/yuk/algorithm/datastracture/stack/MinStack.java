package com.yuk.algorithm.datastracture.stack;

import java.util.Stack;

//현재의 최소값과 새로운값의 비교하여 최고값을 항상 같은 높이의 스택에 둔다
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if(minStack.empty())
            minStack.push(val);
        else{
            minStack.push(Math.min(minStack.peek(), val));
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
