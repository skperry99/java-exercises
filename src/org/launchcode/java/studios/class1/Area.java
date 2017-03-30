package org.launchcode.java.studios.class1;

import java.util.Scanner;

/**
 * Created by Maggie on 3/26/2017.
 */
public class Area {
    public static void main(String[] args){
        double PI = 3.14;
        double r;
        double area;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter a radius:");
            r = in.nextDouble();

            if (r < 0){
                System.out.println("The radius must be a positive number.");
            }else{
                area = PI * r * r;
                System.out.println("The area of a circle of radius " + r + " is: " + area);
            }
        }while (r < 0);
    }
}
