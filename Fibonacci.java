import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        
        System.out.print("Fibonacci series: ");
        printFibonacci(n);
        
    }

    public static void printFibonacci(int n) {
        long a = 0, b = 1;
        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(" " + b);
        for (int i = 3; i <= n; i++) {
            long next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}