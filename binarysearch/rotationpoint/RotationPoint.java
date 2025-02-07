package com.binarysearch.rotationpoint;

public class RotationPoint {
    public static int rotatingPoint(int[] arr){
        int left = 0;
        int right = arr.length-1;
        //binary search
        while(left < right){
            int mid = (left + right)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            } else {
                right = mid;

            }
        }
        //returning the rotating point
        return arr[left];
    }
    //main method
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int result = rotatingPoint(arr);
        System.out.println("rotating point : "+result);

    }
}
