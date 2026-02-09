import java.util.Scanner; // Import the Scanner class to read user input

public class DayFinder {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7 to find the day of the week:");
        int dayNum = input.nextInt();
        String dayName;

        
        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break; 
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number"; 
                break;
        }

        System.out.println("The day is: " + dayName);

      
    }
}
