package com.mishra.utkarsh;

import java.util.Scanner;

public class Menu {
    static String Customer_name;
    static String Customer_address;
    static int pin;
    static int ch;

    static int getNumber(Scanner sc) {
        while (true)
            try {
                ch = Integer.parseInt(sc.nextLine());
                return ch;
            } catch (NumberFormatException exception) {
                System.out.println("Enter a Valid Number !!! ");

            }

    }

    public static void customer_menu(Scanner sc) {

        for (; ; ) {
            System.out.println("******************Customers Menu*****************");
            System.out.println("\t 1. Account Menu");
            System.out.println("\t 2. Display full details");
            System.out.println("\t 3. Change PIN");
            System.out.println("\t 4. Back to Main Menu");
            System.out.println("*************************************************");
            System.out.print("Enter your choice :- ");
            ch = getNumber(sc);

            switch (ch) {
                case 1:
                    System.out.println("Account Menu");
                    break;
                case 2:
                    System.out.println("Details Here");
                    break;
                case 3:
                    System.out.println("Change pin");
                    break;
                case 4:

                    return;

                default:
                    System.out.println("Wrong choice!!!");

            }

        }

    }

    public static void employee_menu(Scanner sc) {

        for (; ; ) {
            System.out.println("******************Employee Menu*****************");
            System.out.println("\t 1. Add a Customer");
            System.out.println("\t 2. Modify Customer Details");
            System.out.println("\t 3. Remove a Customer");
            System.out.println("\t 4. Back to Main Menu");
            System.out.println("*************************************************");
            System.out.print("Enter your choice :- ");

            ch = getNumber(sc);
            switch (ch) {
                case 1:
                    System.out.println("Add customer here");
                    break;
                case 2:
                    System.out.println("modify customer here");
                    break;
                case 3:
                    System.out.println("remove a customer here");
                    break;
                case 4:

                    return;

                default:
                    System.out.println("Wrong choice!!!");

            }

        }

    }

    public static void add_customer(Scanner sc) {
        System.out.println("Enter the customer info :");
        System.out.print("Customer Name :");
        Customer_name = sc.nextLine();
        System.out.print("Customer Address :");
        Customer_address = sc.nextLine();
        System.out.println("Customer PIN :");
        pin = Integer.parseInt(sc.nextLine());

    }

}