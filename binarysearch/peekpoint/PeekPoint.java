package com.binarysearch.peekpoint;

public class PeekPoint {
    //method for finding peek point in array
    public static int peekPoint(int[] arr){
        int left = 0;
        int right  = arr.length-1;
        //Binary search
        while(left < right){
            int mid = (left+right)/2;
            //Condition for finding peek element in the array
            if(arr[mid] > arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            } else if (arr[mid]<arr[mid-1]) {
                right = mid -1 ;
            } else if (arr[mid]<arr[mid+1]) {
                left = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 9, 8, 6, 2, 1};
        int result = peekPoint(arr);
        //Printing Peek point
        System.out.println("Peek point: "+result);
    }
}
