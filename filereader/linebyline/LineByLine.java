package com.filereader.linebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LineByLine {
    public static void main(String[] args) {
        //taking the filepath
        String filename = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day4_StringBuilderAndStringBuffer\\src\\main\\java\\com\\filereader\\linebyline\\testtext.txt";
        //try block for handling exception like file not found
        try{
            //creating the bufferReader object
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            //Getting lines from the files
            String line  ;
            //Traversing each line
            while((line= bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
