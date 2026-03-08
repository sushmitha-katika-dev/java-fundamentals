package com.java.fundamentals;

import java.util.Scanner;

public class ProductMembershipBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name = scanner.next();
        System.out.println("Enter Email");
        String email = scanner.next();
        System.out.println("Enter phone number");
        float phoneNumber = scanner.nextFloat();
        System.out.println("Enter Membership");
        char membership = scanner.next().charAt(0);
        System.out.println("Enter Age");
        byte age = scanner.nextByte();
        System.out.println("------*** Customer Details ***-------");
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone Nummber : "+phoneNumber);
        System.out.println("Membership : "+membership);
        System.out.println("Age : "+age);
        System.out.println("---*** Product Membership Billing System ***---");
        int produtPrice = 10000;
        System.out.println("Product Price : "+produtPrice);
        double discountPercentage = 0;
        if(age > 50){
            if (membership == 'G' || membership == 'g') {
                discountPercentage = 50;
            }
            if(membership == 'S' || membership == 's'){
                discountPercentage = 40;
            }
            if (membership == 'D' || membership == 'd'){
                discountPercentage = 60;
            }
        }else {
            discountPercentage = 10;
        }

        System.out.println("Discount Percent % : "+discountPercentage);
        double discountedAmount = (discountPercentage*produtPrice)/100;
        System.out.println("Discounted Amount : "+discountedAmount);
        double amount = produtPrice - (discountPercentage*produtPrice)/100;
        System.out.println("After Discount Amount : "+amount);
        byte cgst = 5;
        byte sgst = 5;
        double cgstAmount = (amount*cgst)/100;
        System.out.println("CGST 5% : "+cgstAmount);
        double sgstAmount = (amount*sgst)/100;
        System.out.println("SGST 5% : "+sgstAmount);
        double finalPrice = amount + cgst + sgst;
        System.out.println("Final Bill : "+finalPrice);
        System.out.println("------ ******** ------");

    }
}
