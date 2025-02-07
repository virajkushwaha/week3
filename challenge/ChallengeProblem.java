package com.challenge;

import java.io.*;

public class ChallengeProblem {
    public static void main(String[] args) {
        //taking string for concatenation
        String concatenation = " Perform";
        long starttime,endtime;
        StringBuffer stringBuffer = new StringBuffer("");
        //taking current time
        starttime = System.nanoTime();
        //appending the stringBuffer in the concatenation
        for(int i = 0;i<100000;i++){
            stringBuffer.append(concatenation+" ");
        }
        endtime = System.nanoTime();
        //print time taken by String buffer
        System.out.println("Time taken by String buffer: "+(endtime-starttime));

        StringBuilder stringBuilder = new StringBuilder("");
        starttime = System.nanoTime();
        //appending the stringBuild in the concatenation
        for(int i = 0;i<100000;i++){
            stringBuilder.append(concatenation+" ");
        }
        endtime = System.nanoTime();
        System.out.println("Time taken by String builder: "+(endtime-starttime));
        System.out.println("------------------------------------------------------------------------------------");
        //For file reader
        String filename = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day4_StringBuilderAndStringBuffer\\src\\main\\java\\com\\challenge\\testtext.txt";
        int countWord = 0;
        starttime = System.nanoTime();
        try(FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr)){
            String newline = br.readLine();
            while(newline != null){
                String[] wordOfArray = newline.split(" ");
                for(String i : wordOfArray){
                    countWord++;
                }
                newline = br.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        endtime = System.nanoTime();
        System.out.println("Time taken by File Reader: "+(endtime-starttime));
        System.out.println("wordCount: "+countWord);
        //Finding time for count Word
        countWord = 0;
        starttime = System.nanoTime();
        try(FileInputStream fr = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(fr,"UTF-8");
            BufferedReader br = new BufferedReader(isr)){
            String newline = br.readLine();
            while(newline != null){
                String[] wordOfArray = newline.split(" ");
                for(String i : wordOfArray){
                    countWord++;
                }
                newline = br.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        endtime = System.nanoTime();
        System.out.println("Time taken by InputStreamReader: "+(endtime-starttime));
        System.out.println("wordCount by InputStreamReader: "+countWord);
    }
}
