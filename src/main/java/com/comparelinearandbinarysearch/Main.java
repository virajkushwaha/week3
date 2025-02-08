package com.comparelinearandbinarysearch;
import java.util.Arrays;
import static com.comparelinearandbinarysearch.CompareLinearAndBinary.*;
public class Main {
    public static void main(String[] args) {

        int arrOfSize1000[] = randomArrayGenrator(1000);
        int arrOfSize10000[] = randomArrayGenrator(10000);
        int arrOfSize1000000[] = randomArrayGenrator(1000000);

        int arrOfSize1000Sorted[] = arrOfSize1000;
        Arrays.sort(arrOfSize1000Sorted);
        int arrOfSize10000Sorted[] = arrOfSize10000;
        Arrays.sort(arrOfSize10000Sorted);
        int arrOfSize1000000Sorted[] = arrOfSize1000000;
        Arrays.sort(arrOfSize1000000Sorted);

        double timeTakenbyLinear1000 = linearSearch(arrOfSize1000,12);
        double timeTakenbyLinear10000 = linearSearch(arrOfSize10000,6);
        double timeTakenbyLinear1000000 = linearSearch(arrOfSize1000000,8);
        System.out.println("Linear Search on 1000 element:"+timeTakenbyLinear1000);
        System.out.println("Linear Search on 10000 element:"+timeTakenbyLinear10000);
        System.out.println("Linear Search on 1000000 element:"+timeTakenbyLinear1000000);

        System.out.println("-----------------------------------------------------------------------");

        double timeTakenbyBinary1000 = binarySearch(arrOfSize1000Sorted,24);
        double timeTakenbyBinary10000 = binarySearch(arrOfSize10000Sorted,55);
        double timeTakenbyBinary1000000 = binarySearch(arrOfSize1000000Sorted,99);

        System.out.println("Binary Search on 1000 element:"+timeTakenbyBinary1000);
        System.out.println("Binary Search on 10000 element:"+timeTakenbyBinary10000);
        System.out.println("Binary Search on 1000000 element:"+timeTakenbyBinary1000000);

    }
}
