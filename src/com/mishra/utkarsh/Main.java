package com.mishra.utkarsh;

import java.util.Scanner;
public class Main extends Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("******************Savvy Banking App*****************");
            System.out.println("\t 1. Customer Menu");
            System.out.println("\t 2. Employee Menu");
            System.out.println("\t 3. Exit App");
            System.out.println("****************************************************");
            System.out.print("Enter your choice :- ");
            ch = getNumber(sc);
            switch (ch) {
                case 1:

                    customer_menu(sc);

                    break;
                case 2:
                    employee_menu(sc);
                    break;
                case 3:
                    System.out.println("Exit Menu");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!!!");
            }
        }

    }
}
