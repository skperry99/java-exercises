package org.launchcode.java.prep.class2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Maggie on 3/26/2017.
 */
public class Exercise1 {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = 1; i < 11; i++){
            numList.add(i);
        }

        int numListSum = addEvens(numList);

        System.out.println("The sum of the even numbers in the list is: " + numListSum);
    }

    private static int addEvens(ArrayList<Integer> list){
        int sum = 0;

        for (Integer num : list){
            if (num%2 == 0){
                sum += num;
            }
        }

        return sum;
    }
}
