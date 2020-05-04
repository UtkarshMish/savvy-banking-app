package com.mishra.utkarsh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

private static final Scanner sc = new Scanner(System.in);
private static final String[] FILENAMES = {"./customers.txt", "./employee.txt"};
static private int PIN;
static private long accountNo;

static private boolean checkPIN(File userDetails) throws FileNotFoundException {
	var fileReader = new Scanner(userDetails);
	while (fileReader.hasNextLine()) {
		String line = fileReader.nextLine();
		String[] customer_details = line.split("\\|\\|");
		if (Integer.parseInt(customer_details[0]) == accountNo && Integer.parseInt(customer_details[1]) == PIN) {
			fileReader.close();
			return true;
		}
	}
	return false;
}

static private boolean verifyUser(int mode) throws FileNotFoundException {
	try {
		var userDetails = new File(FILENAMES[mode]);
		boolean exist = userDetails.exists();
		if (mode == 1 && (!exist)) {
			var employee = new Employee();
			employee.add_employee(FILENAMES[mode]);
			return true;
		} else if (exist) {
			System.out.println("Enter your Account Number :");
			accountNo = Long.parseLong(sc.nextLine());
			System.out.println("Enter your PIN :");
			PIN = Integer.parseInt(sc.nextLine());
			if ((PIN >= 1_000 && PIN < 10_000) && (accountNo >= 10_000_000 && accountNo < 100_000_000)) {
				if (checkPIN(userDetails)) {
					return true;
				}
			}
		}
	} catch (NumberFormatException e) {
		System.out.println("Enter a Valid Number !!!");

	}
	return false;
}

public static void main(String[] args) throws FileNotFoundException {

	while (true) {
		System.out.println("******************Savvy Banking App*****************");
		System.out.println("\t 1. Customer Menu");
		System.out.println("\t 2. Employee Menu");
		System.out.println("\t 3. Exit App");
		System.out.println("****************************************************");
		System.out.print("Enter your choice :- ");
		int ch = Integer.parseInt(sc.nextLine());
		switch (ch) {

			case 1:
				if (verifyUser(0)) {
					var customer = new Customer();
					customer.customer_menu();
					break;
				}
				System.out.println("Invalid DETAILS !!! Try Again !!!");
				break;

			case 2:
				if (verifyUser(1)) {
					var employee = new Employee();
					employee.employee_menu();
					break;

				}
				System.out.println("Invalid DETAILS !!! Try Again !!!");
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
