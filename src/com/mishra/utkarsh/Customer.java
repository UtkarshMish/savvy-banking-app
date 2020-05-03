package com.mishra.utkarsh;

import java.util.Scanner;

public class Customer {

public void customer_menu(Scanner sc) {

	for (; ; ) {
		System.out.println("******************Customers Menu*****************");
		System.out.println("\t 1. Account Menu");
		System.out.println("\t 2. Display full details");
		System.out.println("\t 3. Change PIN");
		System.out.println("\t 4. Back to Main Menu");
		System.out.println("*************************************************");
		System.out.print("Enter your choice :- ");
		int ch = Integer.parseInt(sc.nextLine());

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

}
