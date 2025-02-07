package com.linearsearch.searchfirstnegative;

public class SearchFirstNegativeNumber {

    //Method to find the first negative number index of the array
    public static int getIndexOfFirstNegativeNumber(int[] array){

        //Iterate array through loop if we find the negative number we return the index
        for(int i=0; i<array.length; i++){
            if(array[i] < 0){
                return i;
            }
        }

        //Otherwise it returns -1 that indicate that no negative number is present
        return -1;
    }
    public static void main(String[] args) {

        //Create a array
        int[] array = {1, 2, 5, 0, 0, -9};

        //Method calling to get the index of first negative number
        int index = getIndexOfFirstNegativeNumber(array);

        //Display the result
        if(index == -1) {
            System.out.println("No negative number present in this array");
        }else{
            System.out.println("First negative number present at index : "+ index);
        }
    }
}
