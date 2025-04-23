import java.util.Scanner;

class Area {
    double length;    // default (package-private) access
    double breadth;   // default (package-private) access

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        scanner.close();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Invalid dimensions: Please enter positive numbers");
            return;
        }

        Area rectangle = new Area();
        rectangle.setDim(length, breadth);
        System.out.printf("Area of rectangle: %.2f%n", rectangle.getArea());
    }
}
