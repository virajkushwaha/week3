package com.linearsearch.word;

public class SearchSpecificWord {

    //Create a Method that searching the matching word in the sentence
    public static String searchWord(String sentence, String targetWord){

        //Create a String array that contains the word of the sentence
        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++){
            if(words[i].equals(targetWord)){
                return "Word is found";
            }
        }
        return "Word is not found";

    }
    public static void main(String[] args) {

        //Take a String array that contains the sentence
        String[] sentenceArray = {
                "Hello, World!",
                "This is a sample text file",
                "It contains multiple lines."

        };

        //Iterate over a String array
        for(int i=0; i<sentenceArray.length; i++){

            //Check the word are present in the sentence or not using searchWord Method
            String result = searchWord(sentenceArray[i],"is");

            //Print the result
            System.out.println(result);
        }
    }
}
