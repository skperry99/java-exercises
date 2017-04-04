package org.launchcode.java.prep.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Sarah on 4/3/2017.
 */
public class StudentIDHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student name: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")){
                System.out.print("Student ID: ");
                int newID = in.nextInt();
                students.put(newID,newStudent);
            }

            in.nextLine();
        }while (!newStudent.equals(""));

        System.out.println("\nStudent ID - Name: ");
        for (Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }
}
