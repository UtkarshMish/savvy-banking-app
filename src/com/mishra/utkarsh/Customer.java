package com.mishra.utkarsh;

import java.io.FileNotFoundException;

public class Customer extends FileOperation {

private String Customer_name;
private String Customer_address;
private long accountNo;
private int PIN;

public void customer_menu() {

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

protected void add_customer() throws FileNotFoundException {
	System.out.println("---------Enter the Customer info :------------");
	System.out.print("Customer Name :");
	Customer_name = sc.nextLine();
	System.out.print("Customer Address :");
	Customer_address = sc.nextLine();
	System.out.println("Customer PIN :");
	PIN = Integer.parseInt(sc.nextLine());
	accountNo = getAccount(1);
	if (accountNo != -1) {
		write_to_file(0, accountNo, PIN, Customer_name, Customer_address);
	}

}
}
