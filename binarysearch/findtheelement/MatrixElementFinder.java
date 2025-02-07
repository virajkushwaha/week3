package com.binarysearch.findtheelement;

public class MatrixElementFinder {
    public static boolean finderinMatrix(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row*col-1;
        int mid ,i , j;
        while(left<=right){
            //Calculating the middle value every time if target not found
            mid = left+(right-left)/2;
            i = mid/col;
            j = mid%col;
            //checking the target value
            if(matrix[i][j] == target){
                return true;
            } else if (matrix[i][j]>target) {
                right = mid - 1 ;

            }else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //initializing the matrix
        int[][] matrix = {{1,2,3,},{4,5,6},{7,8,9}};
        int target = 8;

        boolean result = finderinMatrix(matrix,target);
        //Printing the result if target value is found or not
        if(result){
            System.out.println("Number Found");
        }
        else{
            System.out.println("Number Not found");
        }
    }
}
