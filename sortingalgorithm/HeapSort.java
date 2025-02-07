package sortingalgorithm;

public class HeapSort {

    // Method to sort the array using Heap Sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum value) with the last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify the array
    private static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap and continue heapifying
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }

    // Method to print the salaries
    public static void printSalaries(int[] salaries) {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Salaries of Employees
        int[] salaries = {50000, 60000, 45000, 75000, 40000, 65000};

        System.out.println("Original Salaries:");
        printSalaries(salaries);

        // Sorting the salaries using Heap Sort
        heapSort(salaries);

        // Printing the sorted salaries
        System.out.println("Sorted Salaries:");
        printSalaries(salaries);
    }
}
