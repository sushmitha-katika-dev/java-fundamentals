package com.java.fundamentals;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MRP : ");
        int maxRetail = scanner.nextInt();
        System.out.print("Enter discount : ");
        double discountPercentage = scanner.nextByte();
        double discountAmount =  (discountPercentage * maxRetail) /100;
        double afterDiscountAmount = maxRetail - discountAmount;
        System.out.println("MaxRetailPrice : "+maxRetail);
        System.out.println("Discount %: "+discountPercentage);
        System.out.println("After Discount Amount :"+afterDiscountAmount);
        double centralTaxPercent = 2.5;
        double stateTaxPercent = 2.5;
        double centralTax = (centralTaxPercent * afterDiscountAmount)/100;
        System.out.println("Central Tax 2.5%: "+centralTax);
        double stateTax = (stateTaxPercent * afterDiscountAmount)/100;
        System.out.println("State Tax 2.5%: "+stateTax);
        double finalAmount = afterDiscountAmount + centralTax+stateTax;
        System.out.println("Final Amount : "+finalAmount);
    }
}
