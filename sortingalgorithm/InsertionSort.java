package sortingalgorithm;

public class InsertionSort {

    // Method to sort the array using Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // array of employee IDs
        int[] employeeID = { 29, 10, 14, 37, 13, 5, 2, 11 };


        // Sorting the marks using insertion Sort
        insertionSort(employeeID);

        //  Printing the sorted employee IDs
        for(int i :  employeeID){
            System.out.print(i+" ");
        }
    }
}