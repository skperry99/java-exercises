package org.launchcode.java.prep.class2;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by Sarah on 3/30/2017.
 */
public class Exercise2 {
    public static void main(String[] args){
        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("one", "two", "words", "mouse", "truck"));

        for (String word : listOfWords){
            if (word.length()==5){
                System.out.println(word);
            }
        }
    }
}
