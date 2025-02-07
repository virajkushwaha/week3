package com.inputstreamreader.writingthefile;

import java.io.*;

public class FileWritter {
    public static void main(String[] args) {
        //Output file for storing the file
        String outputFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day4_StringBuilderAndStringBuffer\\src\\main\\java\\com\\inputstreamreader\\writingthefile\\output.txt";
        //InputStream try block to create the file by the user
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(outputFile,true);
            BufferedWriter bw = new BufferedWriter(fileWriter)){
            //printing the condition for exit the file
            System.out.println("Enter the text line by line .Type 'exit' to exit the file  ");
            String inputLine;
            while(true){
                inputLine = br.readLine();
                //Condition for exiting the file
                if(inputLine.equals("exit")){
                    System.out.println("Exiting the file");
                    break;

                }
                //writting and appending the file
                bw.write(inputLine);
                bw.newLine();
                bw.flush();
            }
            System.out.println("File is saved"+outputFile);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
