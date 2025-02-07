package com.stringbuilder.reversestringbystringbuilder;

public class ReverseString {
    public static void main(String[] args) {
        //taking the string
        String word = "Hello";
        //Creating the object for StringBuilder
        StringBuilder reverseWord = new StringBuilder(word);
        //Using StringBuilder Functionality to reverse the string
        reverseWord.reverse();
        //Printing the output
        System.out.println("Original Word: "+word);
        System.out.println("Reverse Word: "+reverseWord);
    }
}
