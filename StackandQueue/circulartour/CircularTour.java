package StackandQueue.circulartour;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public static int checkingStartingPoint(int[] petrol,int[] distance){
        Queue<Integer> queue = new LinkedList<>();
        int lengthOfArr = petrol.length;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < lengthOfArr; i++) {
            // Update fuel balance
            sum += petrol[i] - distance[i];
            // Add current pump index to the queue
            queue.offer(i);

            // If balance is negative, reset the queue and move start
            while (sum < 0 && !queue.isEmpty()) {
                // Remove the front element
                int removed = queue.poll();
                // Adjust balance
                sum -= (petrol[removed] - distance[removed]);
                // Move the start index forward
                start = removed + 1;
            }
        }
        return (sum>=0) ? start:-1;


    }

    public static void main(String[] args) {
        int [] petrol = {4,6,7,4};
        int [] price = {6,5,3,3};
        System.out.println("Starting petrol pump: "+checkingStartingPoint(petrol,price));
    }
}
