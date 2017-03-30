package org.launchcode.java.prep.class1;

import java.util.Scanner;

/**
 * Created by Maggie on 3/26/2017.
 */
public class NumericTypes2 {
    public static void main(String[] args){
        float gasUsed = 0;
        float milesDriven = 0;
        float mpg = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        milesDriven = in.nextFloat();

        System.out.println("How many gallons of gas have you used?");
        gasUsed = in.nextFloat();

        mpg = milesDriven/gasUsed;

        System.out.println("MPG: " + mpg);
    }
}
