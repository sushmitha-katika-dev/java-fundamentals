package com.java.fundamentals;

import java.util.Scanner;

public class ProductDataManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product Id ");
        int productId = scanner.nextInt();

        System.out.println("Enter category code");
        char categoryCode = scanner.next().charAt(0);

        System.out.println("Enter quantity");
        short quantity = scanner.nextShort();

        System.out.println("Enter price");
        double price = scanner.nextDouble();

        System.out.println("Enter discount");
        float discount = scanner.nextFloat();

        System.out.println("Enter supplier contact");
        long supplierContact = scanner.nextLong();

        System.out.println("Enter is product available");
        boolean isAvailable = scanner.nextBoolean();

        System.out.println("Enter product rating");
        byte rating = scanner.nextByte();

        System.out.println("--- Product Details ---");
        System.out.println("ID : "+productId);
        System.out.println("Category Code : "+categoryCode);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+price);
        System.out.println("Discount : "+discount);
        System.out.println("Supplier Contact : "+supplierContact);
        System.out.println("Available : "+isAvailable);
        System.out.println("Rating : "+rating);

        scanner.close();
    }
}
