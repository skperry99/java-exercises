package org.launchcode.java.prep.class1;

import java.util.Scanner;

/**
 * Created by Maggie on 3/16/2017.
 */
public class NumericTypes1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double length;
        double width;

        System.out.println("What is the length of the rectangle?");
        length = in.nextDouble();

        if (length < 0){
            do {
                System.out.println("Please enter a positive number: ");
                length = in.nextDouble();
            }while (length < 0);
        }

        System.out.println("What is the width of the rectangle?");
        width = in.nextDouble();

        if (width < 0){
            do {
                System.out.println("Please enter a positive number: ");
                width = in.nextDouble();
            }while (width < 0);
        }

        System.out.println("The area of the rectangle is: " + (length*width));
    }
}

