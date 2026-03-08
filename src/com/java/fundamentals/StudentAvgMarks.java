package com.java.fundamentals;

import java.util.Scanner;

public class StudentAvgMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int sub1 = scanner.nextInt();
        System.out.println("Enter sub2 marks");
        int sub2 = scanner.nextInt();
        System.out.println("Enter sub3 marks");
        int sub3 = scanner.nextInt();
        System.out.println("Enter sub4 marks");
        int sub4 = scanner.nextInt();
        int totalMarks = sub1+sub2+sub3+sub4;
        double average;
        //average = totalMarks /4.0;
        average = (double) totalMarks /4;
        System.out.println("Subject1 : "+sub1);
        System.out.println("Subject2 : "+sub2);
        System.out.println("Subject3 : "+sub3);
        System.out.println("Subject4 : "+sub4);
        System.out.println("Average : "+average);
    }
}
