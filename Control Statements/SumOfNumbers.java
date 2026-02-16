import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        
        System.out.print("How many numbers do you want to sum? ");
                int count = scanner.nextInt();

        
        for (int i = 0; i < count; i++) {
                        System.out.print("Enter number #" + (i + 1) + ": ");
            
            int numberInput = scanner.nextInt();
            sum += numberInput;
        }

                System.out.println("The total sum is: " + sum);

                    }
}
