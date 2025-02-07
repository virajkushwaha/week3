
package sortingalgorithm;

public class SelectionSort {
    // Method to sort the array using Selection Sort
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Method to print the scores
    public static void printScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scores of Students
        int[] scores = {85, 92, 78, 91, 88, 76};

        System.out.println("Original Scores:");
        printScores(scores);
        // Sorting the scores using Selection Sort
        selectionSort(scores);
        // Printing the sorted scores
        System.out.println("Sorted Scores:");
        printScores(scores);
    }
}




