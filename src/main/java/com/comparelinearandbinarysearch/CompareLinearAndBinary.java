package com.comparelinearandbinarysearch;

import java.util.Random;

public class CompareLinearAndBinary {
    //Applying Linear Search and return its time taking
    static double linearSearch(int ar[],int target){
        double startime;
        double endtime;
        boolean isFound = false;
        startime = System.nanoTime();
        for (int i = 0;i<ar.length;i++){
            if(ar[i] == target){
                isFound = true;
            }
        }
        endtime = System.nanoTime();
        System.out.println("Target Found : "+isFound);
        return (endtime - startime)/1e6;
    }
    //Applying Binary Search and return its time taking
    public static double binarySearch(int ar[], int target) {
        double startTime = System.nanoTime();
        int left = 0;
        int right = ar.length - 1;
        boolean isFound = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ar[mid] == target) {
                isFound = true;
                double endTime = System.nanoTime();
                //Convert nano to milisec
                return (endTime - startTime)/1e6 ;
            } else if (ar[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target Found : "+isFound);
        double endTime = System.nanoTime();
        return (endTime - startTime)/1e6 ;
    }
    //Genrating random array of specific length
    static int[] randomArrayGenrator(int size){
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            int element = (int) (Math.random()*100)+1;
            arr[i] = element;
        }
        return arr;
    }
}
