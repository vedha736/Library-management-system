package com.library;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allowedDays = 7;
        double finePerDay = 5.0;

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Number of Books: ");
        int books = sc.nextInt();
        System.out.print("Enter Days Borrowed: ");
        int days = sc.nextInt();

        int extraDays = Math.max(0, days - allowedDays);
        double totalFine = extraDays * finePerDay * books;

        System.out.println("\n--- Library Receipt ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Issued: " + books);
        System.out.println("Total Fine: Rs. " + totalFine);
        sc.close();
    }
}
