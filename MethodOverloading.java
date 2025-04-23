import java.util.Scanner;

class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum of integers: " + calc.add(a, b));
        
        System.out.print("Enter two doubles: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.printf("Sum of doubles: %.2f%n", calc.add(x, y));
        
        System.out.print("Enter three integers: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("Sum of three integers: " + calc.add(p, q, r));
        
        scanner.close();
    }
}