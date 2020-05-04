package com.mishra.utkarsh;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class FileOperation {
protected static final Scanner sc = new Scanner(System.in);
private static final String[] FILENAMES = {"./customers.txt", "./employee.txt"};

protected static long getAccount(int mode) throws FileNotFoundException {
	AtomicReference<String> line = new AtomicReference<>("");
	var file = new File(FILENAMES[mode]);
	if (!file.exists()) {
		var fileReader = new Scanner(file);
		while (fileReader.hasNextLine()) line.set(fileReader.nextLine());
		if (line.get().length() != 0) {
			String[] customer_details = line.get().split("\\|\\|");
			long accountNumber = Long.parseLong(customer_details[0]);
			fileReader.close();
			return accountNumber;
		}
	} else return 10_000_000;
	return -1;

}


protected static void write_to_file(
		int mode, long Number, int PIN, String name, String address
) {
	var file = new File(FILENAMES[mode]);
	try {

		if (file.createNewFile() || file.exists()) {
			var writer = new FileWriter(FILENAMES[mode], true);
			BufferedWriter out = new BufferedWriter(writer);
			String employee_data = String.format("%d||%d||%s||%s", Number, PIN, name, address);
			out.write(employee_data);
			out.newLine();
			writer.close();
			System.out.println("accountNo: " + Number);
		}
	} catch (IOException e) {
		System.out.println("Error :" + e.getMessage());
	}

}
}
