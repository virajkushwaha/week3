package sortingalgorithm;

public class CountingSort {
    // Method to sort the array using Counting Sort
    public static void countingSort(int[] ages) {
        int range = 18 - 10 + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - 10] - 1] = age;
            count[age - 10]--;
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }
    // Method to print the ages
    public static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Ages of Students
        int[] ages = {15, 12, 17, 10, 16, 18, 14, 11, 13, 16};

        System.out.println("Original Ages:");
        printAges(ages);

        // Sorting the ages using Counting Sort
        countingSort(ages);

        // Printing the sorted ages
        System.out.println("Sorted Ages:");
        printAges(ages);
    }
}
