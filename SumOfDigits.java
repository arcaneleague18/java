import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong(); // Use long for larger numbers
        
        int sum = sumOfDigits(Math.abs(num)); // Handle negative numbers
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

    public static int sumOfDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}