import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();
        if (year <= 0) {
            System.out.println("Invalid year: Please enter a positive number");
            return;
        }
        
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " is " + (isLeap ? "" : "not ") + "a leap year");
        
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}