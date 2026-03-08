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
        System.out.println("Enter Membership(S/G/D)");
        char membership = scanner.next().charAt(0);
        System.out.println("Enter Age");
        byte age = scanner.nextByte();

        int produtPrice = 10000;
        byte cgst = 5;
        byte sgst = 5;
        double shipping = 0;
        System.out.println("Enter quantity");
        byte quantity = scanner.nextByte();
        
        double discountPercentage = 0;
        if(age > 50){
            if (membership == 'G' || membership == 'g') {
                discountPercentage = 50;
                shipping = 20;
            }
            if(membership == 'S' || membership == 's'){
                discountPercentage = 40;
                shipping = 50;
            }
            if (membership == 'D' || membership == 'd'){
                discountPercentage = 60;
                shipping = 0;
            }
        }else {
            discountPercentage = 10;
            shipping = 100;
        }

        //discount calculatio
        double discountPrice = (discountPercentage*produtPrice)/100;
        double discountedPrice = produtPrice - discountPrice;
        
        //Tax calculation
        double cgstAmount = (discountedPrice * cgst) /100;
        double sgstAmount = (discountedPrice * sgst)/100;
        
        double finalPricePerProduct = discountedPrice + cgstAmount + sgstAmount;

        // Final bill
        double finalBill = (finalPricePerProduct * quantity) + shipping;

        double totalSavings = discountPrice * quantity;

        System.out.println("\n========= BILL SUMMARY =========");

        System.out.println("\n========= CUSTOMER DETAILS =========");
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Membership : "+membership);
        System.out.println("Age : "+age);
        System.out.println("-------------------------------");

        System.out.println("===== PRODUCT MEMBERSHIP BILLING SYSTEM =====");

        System.out.println("Product Price : "+produtPrice);
        System.out.println("Quantity : " + quantity);

        System.out.println("Discount % : "+discountPercentage+"%");
        System.out.println("Discount Price : "+discountPrice);
        System.out.println("Discounted Price : "+discountedPrice);


        System.out.println("CGST 5% : "+ cgstAmount);
        System.out.println("SGST 5% : "+ sgstAmount);
        System.out.println("Shipping Charges : " + shipping);

        System.out.println("-------------------------------");

        System.out.println("Final Price Per Product : " + finalPricePerProduct);
        System.out.println("Final Bill Amount : " + finalBill);

        System.out.println("Total Savings : ₹" + totalSavings);

        System.out.println("================================");

        scanner.close();

    }
}
