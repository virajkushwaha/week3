package com.filereader.occurenceofwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OccurenceOfWords {
    public static void main(String[] args) {
        //For counting the word occuring in the file
        int counter = 0;
        //taking target string which have to find
        String target = "ac";
        //taking the path of the file
        String filename = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day4_StringBuilderAndStringBuffer\\src\\main\\java\\com\\filereader\\occurenceofwords\\text.txt";
        //trying the code if file exists
        try{
            //creating the bufferReader object along with the fileReader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line = bufferedReader.readLine();
            while((line ) != null){
                String[] words = line.split(" ");
                line = bufferedReader.readLine();
                for(String i:words){
                    if(i.equals(target)){
                        counter++;
                    }
                }
            }
        }
        catch (IOException e){
            //printing the exception
            e.printStackTrace();
        }
        System.out.println("Word "+ target +" occur "+counter+" time");
    }
}
