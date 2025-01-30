package StackandQueue.StackWithQueue;

import java.util.Stack;

public class StackWithQueue {
    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2 = new Stack<>();
    // Push value into stack1
    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        // Transfer elements from stack1 to stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // Retrieve front element
        int popElement = stack2.pop();
        // Transfer back to stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return popElement;
    }
    // Check if both stacks are empty
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek(){
        // Transfer elements to stack2
        while(!stack1.isEmpty()){

            stack2.push(stack1.pop());

        }
        // Retrieve front element
        int peekElement = stack2.peek();
        // Transfer back to stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peekElement;
    }
}
