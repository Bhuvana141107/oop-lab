import java.util.Scanner;

public class MathTrainer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor1 = 7;
        int factor2 = 8;
        int correctAnswer = factor1 * factor2;
        int userGuess;

        System.out.println("--- QUICK MATHS ---");
        
                do {
            System.out.print("What is " + factor1 + " x " + factor2 + "? ");
            userGuess = input.nextInt();

            if (userGuess != correctAnswer) {
                System.out.println("Incorrect. Try again!");
            }

        } while (userGuess != correctAnswer);        
 System.out.println("Brilliant! 56 is correct.");
           }
}
