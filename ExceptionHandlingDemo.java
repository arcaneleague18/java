import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.close();
        if (size <= 0) {
            System.out.println("Invalid size: Please enter a positive number");
            return;
        }
        
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        
        try {
            int value = arr[index];
            int result = value / divisor;
            System.out.println("Value at index " + index + ": " + value);
            System.out.println("Result of division: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Must be between 0 and " + (size - 1));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        
        
    }
}