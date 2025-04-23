import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        scanner.close();
        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, result);
        
    }
}