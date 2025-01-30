package stackqueuehashsethashmap.hashmapshashfunctions.subarrayswithzerosum;

public class SubArrayMain {
    public static void main(String[] args) {
        // Initialize an array with elements
        int arr[] = {-2, 1, 1, 3, -4, 3};

        // Create an instance of SubArray
        SubArray sub = new SubArray();

        // Find subarrays and store results
        sub.pair(arr);

        // Display subarrays with zero sum
        sub.display();
    }
}
