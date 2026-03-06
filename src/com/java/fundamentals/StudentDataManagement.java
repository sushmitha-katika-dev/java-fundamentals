package com.java.fundamentals;

import java.util.Scanner;

public class StudentDataManagement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Roll Number ");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter age");
        byte age = scanner.nextByte();

        System.out.println("Enter Section");
        char section = scanner.next().charAt(0);

        System.out.println("Enter Total marks");
        int totalMarks = scanner.nextInt();

        System.out.println("Enter Average");
        float averageMarks = scanner.nextFloat();

        System.out.println("Enter year of joining ");
        short joiningYear = scanner.nextShort();

        System.out.println("Enter mobile number ");
        long mobileNumber = scanner.nextLong();

        System.out.println("enter passed(true/false");
        boolean isPassed = scanner.nextBoolean();

        System.out.println("--- Student Details ---");
        System.out.println("Roll No: "+rollNumber);
        System.out.println("Age : "+age);
        System.out.println("Section : "+section);
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average : "+averageMarks);
        System.out.println("Year of Joining : "+joiningYear);
        System.out.println("Mobile : "+mobileNumber);
        System.out.println("Passed : "+isPassed);

        scanner.close();
    }
}

