package sortingalgorithm;

// Bubble Sort Algorithm
public class BubbleSort {

    // Method to sort the array using Bubble Sort
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {


        // Marks of Students
        int[] marks = { 29, 10, 14, 37, 13, 5, 2, 11 };


        // Sorting the Marks using Bubble Sort
        bubbleSort(marks);

        //  Printing the sorted Marks
        for(int i :  marks){
            System.out.print(i+" ");
        }


    }
}