import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected String id;
    
    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;
    
    Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: $%.2f (Base: $%.2f, Bonus: $%.2f)%n", calculateSalary(), baseSalary, bonus);
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    Programmer(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: $%.2f (Rate: $%.2f/hour, Hours: %d)%n", calculateSalary(), hourlyRate, hoursWorked);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("ID: ");
        String managerId = scanner.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();
        System.out.print("Bonus: ");
        double bonus = scanner.nextDouble();
        scanner.close();
        if (baseSalary < 0 || bonus < 0) {
            System.out.println("Invalid salary or bonus: Must be non-negative");
            return;
        }
        
        Manager manager = new Manager(managerName, managerId, baseSalary, bonus);
        manager.displayInfo();
        
        scanner.nextLine(); // Consume newline
        
        System.out.println("\nEnter Programmer details:");
        System.out.print("Name: ");
        String programmerName = scanner.nextLine();
        System.out.print("ID: ");
        String programmerId = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        
        if (hourlyRate < 0 || hoursWorked < 0) {
            System.out.println("Invalid rate or hours: Must be non-negative");
            return;
        }
        
        Programmer programmer = new Programmer(programmerName, programmerId, hourlyRate, hoursWorked);
        programmer.displayInfo();
        
        
    }
}