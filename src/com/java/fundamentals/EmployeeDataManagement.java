package com.java.fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeDataManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int employeeId = scanner.nextInt();

        System.out.println("EEnter employee age");
        byte age = scanner.nextByte();

        System.out.println("Enter Employee department code");
        char departmentCode = scanner.next().charAt(0);

        System.out.println("enter monthly salary");
        double monthlySalary = scanner.nextDouble();

        System.out.println("Enter years of experience");
        short experienceYears = scanner.nextShort();

        System.out.println("Enter mobile number");
        long mobileNumber = scanner.nextLong();

        System.out.println("Enter is employee permanent (true/false)");
        boolean isPermanent = scanner.nextBoolean();

        System.out.println(" Enter performance Rating");
        float rating = scanner.nextFloat();

        System.out.println("--- Employee Details ---");
        System.out.println("ID : "+employeeId);
        System.out.println("Age : "+age);
        System.out.println("Department Code : "+departmentCode);
        System.out.println("Salary : "+monthlySalary);
        System.out.println("Experiece : "+experienceYears);
        System.out.println("Mobile : "+mobileNumber);
        System.out.println("Permanent : "+isPermanent);
        System.out.println("Rating : "+rating);

        scanner.close();
    }
}
