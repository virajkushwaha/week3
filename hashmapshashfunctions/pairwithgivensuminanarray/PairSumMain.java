package stackqueuehashsethashmap.hashmapshashfunctions.pairwithgivensuminanarray;

public class PairSumMain {
    public static void main(String[] args) {

        // Initialize an array with elements
        int arr[] = {2, 1, 3, 3, 4, 3};

        // Define the target sum
        int given = 6;

        // Create an instance of PairSum
        PairSum par = new PairSum();

        // Find subarrays and store results
        par.pair(arr, given);

        // Display subarrays with the given sum
        par.display();
    }
}
