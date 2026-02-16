import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

                while (choice != 3) {
            System.out.println("\n--- MINI CALCULATOR ---");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Square a number");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            choice = input.nextInt();

            
            if (choice == 1) {
                System.out.println("Result: Hello World!");
            } else if (choice == 2) {
                System.out.print("Enter number to square: ");
                int num = input.nextInt();
                System.out.println("Result: " + (num * num));
            } else if (choice == 3) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

            }
}
