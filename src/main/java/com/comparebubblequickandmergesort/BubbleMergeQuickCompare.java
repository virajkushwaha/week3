package com.comparebubblequickandmergesort;

import java.util.Arrays;

public class BubbleMergeQuickCompare {
    static double bubbleSort(int[] arr){
        double startTime = System.nanoTime();
        int start;
        for (int i = 0; i<arr.length;i++){
            boolean isSwap = false;
            for (int j = 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
        double endTime = System.nanoTime();
        System.out.println(" BubbleSort Sorted Array : " + Arrays.toString(arr));
        return (endTime-startTime)/1e6;
    }
    static int partition(int arr[] ,int low ,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = arr[i];
        return i;
    }
    static void quickSortAlgo(int arr[],int low,int high){
        if(low<high) {
            int pindx = partition(arr,low, high);
            quickSortAlgo(arr , low , pindx - 1);
            quickSortAlgo(arr,pindx +1 , high);
        }

    }
    static double quickSort(int[] arr){
        double startTime = System.nanoTime();
        quickSortAlgo(arr,0,arr.length-1);
        double endTime = System.nanoTime();
        return (endTime-startTime)/1e6;
    }

    static double mergeSort(int[] arr){
        double startTime = System.nanoTime();
        mergeSortAlgo(arr,0,arr.length-1);
        double endTime = System.nanoTime();
        return (endTime-startTime)/1e6;
    }

    static void mergeSortAlgo(int arr[],int low, int high){
        if(low<high){
            int mid = low + (high - low)/2;
            mergeSortAlgo(arr,low,mid);
            mergeSortAlgo(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int arr[],int low , int mid , int high){
        int size1 = mid - low +1;
        int size2 = high - mid;
        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];
        int i = 0 , j = 0 , k = low;
        while(i< size1 && j < size2){
            if(leftArr[i]<=rightArr[j]){
                arr[k++] = leftArr[i++];
            }else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < size1) arr[k++] = leftArr[i++];
        while (j < size2) arr[k++] = rightArr[j++];

    }
    static int[] randomArrayGenrator(int size){
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            int element = (int) (Math.random()*100)+1;
            arr[i] = element;
        }
        return arr;
    }
}
