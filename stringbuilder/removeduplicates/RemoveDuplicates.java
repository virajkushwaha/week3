package com.stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashSet<Character> set= new HashSet<>();
        String word = "sdlvfnidghbvkdaskldjbvoiuadbijdsbf";
        StringBuilder withoutDuplicates = new StringBuilder("");
        //loop for traversing the string
        for(int i = 0 ; i < word.length() ; i++){
            //Storing the characters
            char c = word.charAt(i);
            //Checking if the set contains the word or not
            if(set.contains(c)){
                continue;
            }
            //adding to the set
            set.add(c);
            //adding character to the string builder
            withoutDuplicates.append(c);
        }
        System.out.println("String:"+word);
        System.out.println("Without duplicate string: "+withoutDuplicates);
    }
}
