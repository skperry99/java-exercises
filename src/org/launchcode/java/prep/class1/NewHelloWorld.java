package org.launchcode.java.prep.class1;

import java.util.Scanner;

/**
 * Created by Maggie on 3/16/2017.
 */
public class NewHelloWorld {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("Hello, " + name);
    }

}
