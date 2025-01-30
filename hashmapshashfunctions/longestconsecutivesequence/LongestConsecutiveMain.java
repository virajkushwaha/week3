package stackqueuehashsethashmap.hashmapshashfunctions.longestconsecutivesequence;

public class LongestConsecutiveMain {
    public static void main(String[] args) {

        // Create an instance of LongestConsective
        LongestConsective longest = new LongestConsective();

        // Define an array with elements
        int arr[] = {1, 2, 3, 4, 8, 9, 5};

        // Find consecutive sequences in the array
        longest.consective(arr);

        // Find and display the longest consecutive sequence
        longest.maxConsecutive();
    }
}
