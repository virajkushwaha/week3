package com.comparelargefile;



//Import the required packages
import java.io.*;

public class CompareLargeFileReadingEfficiency {
    public static void main(String[] args) {
        //Store the file path
        String filePath = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day6_RuntimeAnalysis\\src\\main\\java\\com\\comparelargefile\\80mb.txt";

        // Measure FileReader Time
        double fileReaderTime = measureFileReader(filePath);

        // Measure InputStreamReader Time
        double inputStreamReaderTime = measureInputStreamReader(filePath);

        // Display results
        System.out.println("Time taken by FileReader: " + fileReaderTime + " ms");
        System.out.println("Time taken by InputStreamReader: " + inputStreamReaderTime + " ms");
        System.out.println("=====================================================");

        //Store the file path
        filePath = "E:\\CapgeminiTraining\\Program_Prerequisite\\week3\\Day6_RuntimeAnalysis\\src\\main\\java\\com\\comparelargefile\\80mb.txt";
        // Measure FileReader Time
        fileReaderTime = measureFileReader(filePath);

        // Measure InputStreamReader Time
        inputStreamReaderTime = measureInputStreamReader(filePath);

        // Display results
        System.out.println("Time taken by FileReader: " + fileReaderTime + " ms");
        System.out.println("Time taken by InputStreamReader: " + inputStreamReaderTime + " ms");
        System.out.println("=====================================================");
    }

    // Measures time taken to read using FileReader (Character Stream)
    public static double measureFileReader(String filePath) {
        long startTime = System.nanoTime();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {

            while (reader.read() != -1) { } // Read character by character

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    // Measures time taken to read using InputStreamReader (Byte Stream)
    public static double measureInputStreamReader(String filePath) {
        long startTime = System.nanoTime();

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            while (reader.read() != -1) { } // Read character by character

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }
}



