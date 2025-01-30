package StackandQueue.SortingUsingStackRecursion;

import java.util.Stack;

public class SortRecursion {
    // Static stack to store elements
    static Stack<Integer> s = new Stack<>();

    // Recursive function to sort the stack
    public void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();
            sortStack(s);
            insertSort(s, top);
        }
    }

    // Recursive function to insert an element into a sorted stack
    public void insertSort(Stack<Integer> stack, int top) {
        // Base condition: If stack is empty or top element is smaller or equal
        if (stack.isEmpty() || stack.peek() <= top) {
            // Push the element back into stack
            stack.push(top);
            return;
        }
        int temp = stack.pop();
        insertSort(stack, top);
        stack.push(temp);
    }

    public static void main(String[] args) {
        // Pushing elements into the stack
        s.push(45);
        s.push(-40);
        s.push(6);
        s.push(86);
        s.push(100);
        s.push(9840);
        s.push(78);
        s.push(9);

        // Display original stack
        System.out.println("Original Stack: " + s);

        // Sorting the stack using recursion
        SortRecursion re = new SortRecursion();
        re.sortStack(s);

        // Display sorted stack
        System.out.println("Sorted Stack: " + s);
    }
}
