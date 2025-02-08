package com.comparedatastructure;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class CompareDataStructure {
    public static void main(String[] args) {
        // Define different dataset sizes to compare performance
        int[] sizes = {1000, 100000, 1000000};

        for (int size : sizes) {
            // Generate test data
            int[] array = generateArray(size);
            HashSet<Integer> hashSet = generateHashSet(array);
            TreeSet<Integer> treeSet = generateTreeSet(array);

            // Pick a random element that is guaranteed to be in the dataset
            int target = pickRandomTarget(array);

            // Measure search time for each data structure
            double arrayTime = searchInArray(array, target);
            double hashSetTime = searchInHashSet(hashSet, target);
            double treeSetTime = searchInTreeSet(treeSet, target);

            // Display results
            displayResult(arrayTime, hashSetTime, treeSetTime, size);
        }
    }

    // Generates an array of random integers with a controlled range
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size); // Limiting range improves HashSet performance
        }
        return array;
    }

    // Converts an array to a HashSet
    public static HashSet<Integer> generateHashSet(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);
        }
        return hashSet;
    }

    // Converts an array to a TreeSet
    public static TreeSet<Integer> generateTreeSet(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num);
        }
        return treeSet;
    }

    // Picks a random element from the array to ensure it's always present
    public static int pickRandomTarget(int[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    // Performs linear search on an array (O(N))
    public static double searchInArray(int[] array, int target) {
        double startTime = System.nanoTime();
        for (int num : array) {
            if (num == target) {
                break;
            }
        }
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    // Searches for an element in a HashSet (O(1) on average)
    public static double searchInHashSet(HashSet<Integer> hashSet, int target) {
        double startTime = System.nanoTime();
        boolean found = hashSet.contains(target);
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    // Searches for an element in a TreeSet (O(log N))
    public static double searchInTreeSet(TreeSet<Integer> treeSet, int target) {
        double startTime = System.nanoTime();
        boolean found = treeSet.contains(target);
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    // Displays the time taken by each sorting algorithm
    public static void displayResult(double result1, double result2, double result3, int size) {
        System.out.println("Time Taken by linear search: " + result1 + " ms for size " + size);
        System.out.println("Time Taken by HashSet: " + result2 + " ms for size " + size);
        System.out.println("Time Taken by TreeSet: " + result3 + " ms for size " + size);
        System.out.println("=====================================================");
    }
}


