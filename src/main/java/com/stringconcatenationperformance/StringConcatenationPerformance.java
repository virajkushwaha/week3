package com.stringconcatenationperformance;




public class StringConcatenationPerformance {
    public static void main(String[] args) {
        // Initial string to concatenate
        String str = "Concatenate";

        // Testing with 1,000 concatenation operations
        int operationCount = 1000;
        double result1 = stringPerformance(str, operationCount);
        double result2 = stringBuilderPerformance(str, operationCount);
        double result3 = stringBufferPerformance(str, operationCount);
        displayResult(result1, result2, result3, operationCount);

        // Testing with 10,000 concatenation operations
        operationCount = 10000;
        result1 = stringPerformance(str, operationCount);
        result2 = stringBuilderPerformance(str, operationCount);
        result3 = stringBufferPerformance(str, operationCount);
        displayResult(result1, result2, result3, operationCount);

        // Testing with 1,000,000 concatenation operations
        operationCount = 1000000;
        result1 = stringPerformance(str, operationCount);
        result2 = stringBuilderPerformance(str, operationCount);
        result3 = stringBufferPerformance(str, operationCount);
        displayResult(result1, result2, result3, operationCount);
    }

    // Prints the time taken by String, StringBuilder, and StringBuffer
    public static void displayResult(double result1, double result2, double result3, int size) {
        System.out.println("Time Taken by String: " + result1 + " ms for size " + size);
        System.out.println("Time Taken by StringBuilder: " + result2 + " ms for size " + size);
        System.out.println("Time Taken by StringBuffer: " + result3 + " ms for size " + size);
        System.out.println("=====================================================");
    }

    // Measures performance of string concatenation using String (immutable)
    public static double stringPerformance(String str, int count) {
        double startTime = System.nanoTime();
        // Concatenating "String" repeatedly using a normal String
        for (int i = 0; i < count; i++) {
            str = str + "String"; // This creates a new String each time (inefficient)
        }
        double endTime = System.nanoTime();
        //Return the time taken
        return (endTime - startTime) / 1e6; // Convert time to milliseconds
    }

    // Measures performance using StringBuilder
    public static double stringBuilderPerformance(String str, int count) {
        double startTime = System.nanoTime();
        // Using StringBuilder for concatenation
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < count; i++) {
            stringBuilder.append("String"); // Modifies the existing object (efficient)
        }
        double endTime = System.nanoTime();
        //Return the time taken
        return (endTime - startTime) / 1e6;
    }

    // Measures performance using StringBuffer
    public static double stringBufferPerformance(String str, int count) {
        double startTime = System.nanoTime();
        // Using StringBuffer for concatenation
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < count; i++) {
            stringBuffer.append("String");
        }
        double endTime = System.nanoTime();
        //Return the time taken
        return (endTime - startTime) / 1e6;
    }
}

