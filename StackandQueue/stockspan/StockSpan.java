package StackandQueue.stockspan;

import java.util.Stack;

public class StockSpan {
    static Stack<Integer> s = new Stack<>();


    public static void stockSpan(int[] arr){
        int[] span = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Pop elements from stack while stack is not empty and top of stack is <= current price
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // If stack is empty, it means no previous greater element, so span = i+1
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());

            // Push current index to stack
            s.push(i);
        }
        // Print the span array
        System.out.print("Stock Span: ");
        for (int sp : span) {
            System.out.print(sp + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {100, 90, 80, 100, 50, 60};
        stockSpan(arr);

    }
}
