import java.util.Scanner;

public class Menu {

    public static void display(Scanner sc) {

        int ch = 0;
        for (;;) {
            System.out.println("******************Customers Menu*****************");
            System.out.println("\t 1. Account Menu");
            System.out.println("\t 2. Display full details");
            System.out.println("\t 3. Change PIN");
            System.out.println("\t 4. Back to Main Menu");
            System.out.println("*************************************************");
            System.out.print("Enter your choice :- ");

            ch = Integer.parseInt(sc.nextLine());
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("******************Savvy Banking App*****************");
            System.out.println("\t 1. Customer Menu");
            System.out.println("\t 2. Employee Menu");
            System.out.println("\t 3. Exit App");
            System.out.println("****************************************************");
            System.out.print("Enter your choice :- ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
            case 1:

                display(sc);

                break;
            case 2:
                System.out.println("Employee Menu");
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