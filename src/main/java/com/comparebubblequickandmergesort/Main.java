package com.comparebubblequickandmergesort;
import java.util.Arrays;

import static com.comparebubblequickandmergesort.BubbleMergeQuickCompare.*;
import static com.comparelinearandbinarysearch.CompareLinearAndBinary.*;
import static com.comparelinearandbinarysearch.CompareLinearAndBinary.binarySearch;

public class Main {
    public static void main(String[] args) {

        int arrOfSize1000[] = randomArrayGenrator(1000);
        int arrOfSize10000[] = randomArrayGenrator(10000);
        int arrOfSize1000000[] = randomArrayGenrator(1000000);



        double timeTakenbybubble1000 = bubbleSort(arrOfSize1000);
        double timeTakenbybubble10000 = bubbleSort(arrOfSize10000);
        double timeTakenbybubble1000000 = bubbleSort(arrOfSize1000000);
        System.out.println("Bubble on 1000 element:"+timeTakenbybubble1000);
        System.out.println("Bubble on 10000 element:"+timeTakenbybubble10000);
        System.out.println("Bubble on 1000000 element:"+timeTakenbybubble1000000);

        System.out.println("-----------------------------------------------------------------------");

        double timeTakenbyMerge1000 = mergeSort(arrOfSize1000);
        double timeTakenbyMerge10000 = mergeSort(arrOfSize10000);
        double timeTakenbyMerge1000000 = mergeSort(arrOfSize1000000);

        System.out.println("Merge on 1000 element:"+timeTakenbyMerge1000);
        System.out.println("Merge on 10000 element:"+timeTakenbyMerge10000);
        System.out.println("Merge on 1000000 element:"+timeTakenbyMerge1000000);

        System.out.println("-----------------------------------------------------------------------");

        double timeTakenbyQuick1000 = quickSort(arrOfSize1000);
        double timeTakenbyQuick10000 = quickSort(arrOfSize10000);
        double timeTakenbyQuick1000000 = quickSort(arrOfSize1000000);

        System.out.println("Merge on 1000 element:"+timeTakenbyQuick1000);
        System.out.println("Merge on 10000 element:"+timeTakenbyQuick10000);
        System.out.println("Merge on 1000000 element:"+timeTakenbyQuick1000000);
    }
}
