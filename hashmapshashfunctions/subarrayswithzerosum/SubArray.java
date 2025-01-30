package stackqueuehashsethashmap.hashmapshashfunctions.subarrayswithzerosum;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class SubArray {
    // HashMap to store subarray index pairs and their sums
    HashMap<Map.Entry<Integer, Integer>, Integer> result = new HashMap<>();

    // Array to store input elements
    int[] res;

    public void pair(int[] arr) {
        res = arr; // Assign input array to res

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                // Create a key representing the subarray from i to j
                Map.Entry<Integer, Integer> key = new AbstractMap.SimpleEntry<>(i, j);

                sum = sum + arr[j];
                result.put(key, sum);
            }
        }
    }

    public void display() {
        // Iterate through stored subarrays and check for zero sum
        for (Map.Entry<Map.Entry<Integer, Integer>, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println("Subarray (" + entry.getKey().getKey() + ", " + entry.getKey().getValue() + ") → Sum: " + entry.getValue());

                System.out.println("The sub array ");

                System.out.print("[");
                // Print the elements of the subarray
                for (int i = entry.getKey().getKey(); i < entry.getKey().getValue() + 1; i++) {
                    System.out.print(res[i]);

                    if (i != entry.getKey().getValue()) {
                        System.out.print(",");
                    }
                }
                System.out.println("]");
            }
        }
    }
}
