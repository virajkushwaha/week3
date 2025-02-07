package com.inputstreamreader.readbinaryfile;

import java.io.*;

public class BinaryFileReader {
    public static void main(String[] args) {
        //taking the filepath
        String filename = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day4_StringBuilderAndStringBuffer\\src\\main\\java\\com\\inputstreamreader\\readbinaryfile\\20240713.jpg";
        //Setting encoding of the file
        String charset = "UTF-8";
        //try block for handling exception like file not found
        try (FileInputStream fr = new FileInputStream(filename)) {
            try (InputStreamReader inputStreamReader = new InputStreamReader(fr, charset);
            BufferedReader br = new BufferedReader(inputStreamReader)) {

                String i = br.readLine();
                while ((i ) != null) {
                    // Reads and prints the file's characters
                    System.out.println(i);
                    i= br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

