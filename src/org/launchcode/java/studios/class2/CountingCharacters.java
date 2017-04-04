package org.launchcode.java.studios.class2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Sarah on 3/6/2017.
 */
public class CountingCharacters {
    public static void main(String[] args){
//        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        String myString;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        myString = in.nextLine();

        HashMap<Character, Integer> gotCounts = getCharCount(myString);

        for (Map.Entry<Character,Integer> count : gotCounts.entrySet()){
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }

    public static HashMap<Character, Integer> getCharCount(String someString){
        String upperSomeString = someString.toUpperCase();
        char[] myStringChars = upperSomeString.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : myStringChars) {
            if (Character.isLetter(character)) {
                if (!charCount.containsKey(character)) {
                    charCount.put(character, 1);
                } else {
                    charCount.replace(character, charCount.get(character) + 1);
                }
            }
        }
        return charCount;
    }
}
