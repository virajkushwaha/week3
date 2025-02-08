package com.recursiveanditerativefibonacci;




public class RecursiveAndIterativeFibonacci {
    public static void main(String[] args) {
        // Define the Fibonacci number position to calculate
        int number = 10;
        // Measure execution time for recursive Fibonacci
        double result1 = iterativeFibonacci(number);
        // Measure execution time for iterative Fibonacci
        double result2 = recursiveFibonacci(number);
        // Display the results
        displayResult(result1, result2, number);

        number = 30;
        // Measure execution time for recursive Fibonacci
        result1 = iterativeFibonacci(number);
        // Measure execution time for iterative Fibonacci
        result2 = recursiveFibonacci(number);
        // Display the results
        displayResult(result1, result2, number);

        number = 50;
        // Measure execution time for recursive Fibonacci
        result1 = recursiveFibonacci(number);
        // Measure execution time for iterative Fibonacci
        result2 = iterativeFibonacci(number);
        // Display the results
        displayResult(result1, result2, number);
    }

    // Displays the execution time for both recursive and iterative Fibonacci methods
    public static void displayResult(double result1, double result2, int size) {
        System.out.println("Time Taken by Recursive Fibonacci: " + result1 + " ms for size " + size);
        System.out.println("Time Taken by Iterative Fibonacci: " + result2 + " ms for size " + size);
        System.out.println("=====================================================");
    }

    // Measures execution time of the recursive Fibonacci function
    public static double recursiveFibonacci(int number) {
        double startTime = System.nanoTime();

        // Calls the recursive Fibonacci function
        int ans = recursive(number);

        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds
    }

    // Recursive Fibonacci function (exponential time complexity)
    private static int recursive(int number) {
        // Base case: If number is 0 or 1, return number itself
        if (number <= 1) {
            return number;
        }

        // Recursive case: Compute Fibonacci using previous two numbers
        return recursive(number - 1) + recursive(number - 2);
    }

    // Measures execution time of the iterative Fibonacci function
    public static double iterativeFibonacci(int number) {
        // Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        double startTime = System.nanoTime();

        // If number is 1, return immediately as Fibonacci(1) = 0
        if (number == 1) {
            double endTime = System.nanoTime();
            return (endTime - startTime) / 1e6;
        }

        // Iteratively compute the Fibonacci sequence up to the given number
        for (int i = 3; i <= number; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds
    }
}


