package stackqueuehashsethashmap.hashmapshashfunctions.longestconsecutivesequence;

import java.util.HashMap;

public class LongestConsective {

    // Store the size of the array
    int size;

    // Store the input array
    int[] base;

    public int find(int k) {

        // Initialize count for consecutive sequence
        int count = 1;

        // Get the current number to check consecutive sequence
        int number = base[k];

        for (int i = k; i < size - 1; i++) {

            // Check if the next number is consecutive
            if ((number + count) == base[i + 1]) {
                count++;
            }
        }

        return count;
    }

    // HashMap to store index and length of consecutive sequences
    HashMap<Integer, Integer> consectivemap = new HashMap<>();

    public void consective(int arr[]) {

        // Assign input array to base
        base = arr;

        // Get array size
        size = arr.length;

        for (int j = 0; j < size; j++) {

            // Store length of consecutive sequence for each index
            consectivemap.put(j, find(j));
        }
    }

    public void maxConsecutive() {

        // Initialize max value to find longest sequence
        int max = Integer.MIN_VALUE;

        for (Integer value : consectivemap.values()) {

            // Compare each value with max and update max if needed
            if (value > max) {
                max = value;
            }
        }

        // Print the longest consecutive sequence length
        System.out.println("The longest consecutive sequence length :- " + max);
    }
}
