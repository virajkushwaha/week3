package sortingalgorithm;

import java.util.Arrays;

public class QuickSort {
    // Method to sort the array using Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    // Method to partition the array
    public static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1;
    }

    // Method to print the prices
    public static void printPrices(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Prices of Products
        double[] prices = {199.99, 99.99, 49.99, 149.99, 249.99, 59.99};

        System.out.println("Original Prices:");
        printPrices(prices);

        // Sorting the prices using Quick Sort
        quickSort(prices, 0, prices.length - 1);

        // Printing the sorted prices
        System.out.println("Sorted Prices:");
        printPrices(prices);
    }
}