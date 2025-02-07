package com.stringbuffer.concatenation;

public class Concatenation {
    public static void main(String[] args) {
        //Array of Strings
        String[] arrayOfString = {"ksdjvb","ldskvn","sdlkvns","lskvn"};
        //Creating obj of StringBuffer
        StringBuffer sentence =new StringBuffer("");
        System.out.print("Array Of String: ");
        System.out.print("[");
        //loop for appending array element in the string
        for (String i : arrayOfString){
            sentence.append(i+" ");
            System.out.print(i+", ");
        }
        System.out.print("]");
        System.out.println();
        //Printing the sentence
        System.out.println("Sentence: "+sentence);
    }
}
