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
        byte cgst = 5;
        byte sgst = 5;
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

        System.out.println("Product Price : "+produtPrice);
        System.out.println("Discount % : "+discountPercentage+"%");

        double discountPrice = (discountPercentage*produtPrice)/100;
        System.out.println("Discount Price : "+discountPrice);

        double discountedPrice = produtPrice - discountPrice;
        System.out.println("Discounted Price : "+discountedPrice);

        double cgstAmount = (discountedPrice * cgst) /100;
        System.out.println("CGST 5% : "+ cgstAmount);

        double sgstAmount = (discountedPrice * sgst)/100;
        System.out.println("SGST 5% : "+ sgstAmount);

        double finalPrice = discountedPrice + cgstAmount + sgstAmount;
        System.out.println("Final Bill : "+finalPrice);

        System.out.println("------ ******** ------");

    }
}
