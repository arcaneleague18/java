import java.util.Scanner;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String id;
    double salary;
    
    Employee(String name, String id, double salary) {
        super(name); // Call parent constructor
        this.id = id;
        this.salary = salary;
    }
    
    void display() {
        super.display(); // Call parent method
        System.out.println("ID: " + id);
        System.out.printf("Salary: $%.2f%n", salary);
    }
    
    void accessParentField() {
        System.out.println("Accessing parent field via super: " + super.name);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.close();
        if (salary < 0) {
            System.out.println("Invalid salary: Must be non-negative");
            return;
        }
        
        Employee employee = new Employee(name, id, salary);
        System.out.println("\nEmployee Details:");
        employee.display();
        
        System.out.println("\nAccessing parent field:");
        employee.accessParentField();
        
        
    }
}