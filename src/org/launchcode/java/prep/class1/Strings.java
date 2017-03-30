package org.launchcode.java.prep.class1;

import java.util.Scanner;

/**
 * Created by Maggie on 3/26/2017.
 */
public class Strings {
    public static void main(String[] args){
        String sentence = new String("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        Scanner in = new Scanner(System.in);
        String searchTerm;
        String sentenceLower = sentence.toLowerCase();

        System.out.println("Enter a word to search for: ");
        searchTerm = in.next();
        String searchLower = searchTerm.toLowerCase();

        if (sentenceLower.contains(searchLower)){
            System.out.println("Your word was found in the sentence.");
        }else {
            System.out.println("Sorry, we couldn't find your word.");
        }
    }
}
