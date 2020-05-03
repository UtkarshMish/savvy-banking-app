package com.mishra.utkarsh;

import java.util.Scanner;

public class Employee {
private String Customer_name;
private String Customer_address;
private int PIN;


public void employee_menu(Scanner sc) {

	for (; ; ) {
		System.out.println("******************Employee Menu*****************");
		System.out.println("\t 1. Add a Customer");
		System.out.println("\t 2. Modify Customer Details");
		System.out.println("\t 3. Remove a Customer");
		System.out.println("\t 4. Back to Main Menu");
		System.out.println("*************************************************");
		System.out.print("Enter your choice :- ");

		int ch = Integer.parseInt(sc.nextLine());
		switch (ch) {
			case 1:
				add_customer(sc);
				System.out.println(Customer_name);
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

public void add_customer(Scanner sc) {
	System.out.println("---------Enter the Customer info :------------");
	System.out.print("Customer Name :");
	Customer_name = sc.nextLine();
	System.out.print("Customer Address :");
	Customer_address = sc.nextLine();
	System.out.println("Customer PIN :");
	PIN = Integer.parseInt(sc.nextLine());

}

}