package com.mishra.utkarsh;


import java.io.FileNotFoundException;

public class Employee extends FileOperation {

private int PIN;
private final long accountNo = 10_000_000;

public void employee_menu() throws FileNotFoundException {

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
				var customer = new Customer();
				customer.add_customer();
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

public void add_employee(String filepath) {
	System.out.println("---------Enter the Employee info :------------");
	System.out.print("Employee Name :");
	String Employee_name = sc.nextLine();
	System.out.print("Employee Address :");
	String Employee_address = sc.nextLine();
	System.out.println("Employee PIN :");
	PIN = Integer.parseInt(sc.nextLine());
	write_to_file(1, accountNo, PIN, Employee_name, Employee_address);
}


}