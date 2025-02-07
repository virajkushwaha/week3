package sortingalgorithm;

// Main class to test the MergeSort class
public class MergeSort {

    // Method to sort the array using Merge Sort
    public static void mergeSort(int[] arr){
        int low = 0;
        int high = arr.length-1;
        divide(arr, low, high);
    }

    //  Method to divide the array into subarrays
    public static void divide(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conquer(arr, low, mid, high);
    }

    // Method to merge the subarrays
    public static void conquer(int[] arr, int low, int mid, int high) {
        int[] mergedArray = new int[high - low + 1];
        int index = 0;
        int idx1 = low;
        int idx2 = mid+1;

        while(idx1 <= mid && idx2 <= high){
            if(arr[idx1] > arr[idx2]) {
                mergedArray[index++] = arr[idx2++];
            }else{
                mergedArray[index++] = arr[idx1++];
            }
        }

        // Copy the remaining elements of the first subarray
        while(idx1 <= mid) mergedArray[index++] = arr[idx1++];

        // Copy the remaining elements of the second subarray
        while(idx2 <= high) mergedArray[index++] = arr[idx2++];

        // Copy the merged array to the original array
        System.arraycopy(mergedArray, 0, arr, low, mergedArray.length);
    }
    public static void main(String[] args) {
        // Prices of Books
        int[] prices = { 29, 10, 14, 37, 13, 5, 2, 11 };


        // Sorting the prices using Merge Sort
        mergeSort(prices);

        //  Printing the sorted prices
        for(int i :  prices){
            System.out.print(i+" ");
        }
    }
}