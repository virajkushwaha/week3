package StackandQueue.slidingwindowmax;

import java.util.ArrayDeque;

public class SlidingWindowMax {
    public static int[] slidingWindow(int[] arr ,int k){
        //take deque obj
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int lenghtOfArray = arr.length;
        //taking another array for storing the value of max elements in the window
        int[] maxArray = new int[arr.length-k+1];
        int max = arr[0];
        //for loop for traversing array
        for(int i = 0;i<lenghtOfArray;i++){
           if(i<k){
               deque.add(arr[i]);
               max = maxArray[0] = Math.max(max,arr[i]);
           }
           else{
               //removing first element from deque and storing in the variable
               int removingElement = deque.removeFirst();
               //adding the element in the deque
               int addingElement = arr[i];
               deque.add(arr[i]);
               //Checking if the addingElement is bigger of not for deter mining the maxValue
               if(addingElement >= max){
                   max = addingElement;
               }
               //Checking if the removing element is same as max value
               else if(removingElement == max){
                   max = addingElement;

                   for(int j : deque){
                       max = Math.max(j,max);
                   }
               }
               //Adding the max values in the array
               maxArray[i-k+1] = max;
           }
        }
        return maxArray;
    }

    public static void main(String[] args) {
        //Taking the array
        int arr[] = {12,54,15,1,64,13};
        //Taking the sliding window
        int k = 3;
        System.out.print("Max Window Array:");
        //Printing array
        for(int i:slidingWindow(arr,k)){
            System.out.print(i+" ");
        }
    }
}
