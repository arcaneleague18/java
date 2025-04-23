abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    String name = "John";
    double baseSalary = 60000;
    
    double calculateSalary() {
        return baseSalary + (baseSalary * 0.2);
    }
    
    void displayInfo() {
        System.out.println("Manager Name: " + name + ", Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    String name = "Alice";
    double baseSalary = 50000;
    
    double calculateSalary() {
        return baseSalary + (baseSalary * 0.1);
    }
    
    void displayInfo() {
        System.out.println("Programmer Name: " + name + ", Salary: " + calculateSalary());
    }
}

public class EmployeeAbstract {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        
        manager.displayInfo();
        programmer.displayInfo();
    }
}