import java.util.Scanner;

public class BloodDonation{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age: ");
        int age = sc.nextInt();
		if (age>=18){
		 System.out.println("Enter your weight: ");
		 int weight=sc.nextInt();
		 if (weight >= 50) {
                System.out.println("Status: You are eligible to donate blood.");
            } else {
                System.out.println("Status: Not eligible (Weight must be at least 50kg).");
            }
        }else {
            System.out.println("Status: Not eligible (Age must be at least 18 years).");
        }
		}
		}
