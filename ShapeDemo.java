import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;
    
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    double calculateArea() {
        // Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius for Circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        if (radius <= 0) {
            System.out.println("Invalid radius: Please enter a positive number");
            return;
        }
        
        Circle circle = new Circle(radius);
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.2f%n", circle.calculatePerimeter());
        
        System.out.println("\nEnter three sides for Triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || 
            side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Invalid triangle sides: Must be positive and satisfy triangle inequality");
            return;
        }
        
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.printf("Triangle Area: %.2f%n", triangle.calculateArea());
        System.out.printf("Triangle Perimeter: %.2f%n", triangle.calculatePerimeter());
        
        
    }
}