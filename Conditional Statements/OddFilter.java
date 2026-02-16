import java.util.Scanner;

public class OddFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter 5 odd numbers (even numbers will be ignored):");

        while (count < 5) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            
            if (num % 2 == 0) {
                System.out.println(num + " is even. Skipping...");
                continue; 
            }

            
            System.out.println("Accepted: " + num);
            count++;
        }

        System.out.println("Done! You entered 5 odd numbers.");
        
    }
}
