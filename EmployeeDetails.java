import java.util.Scanner;

class Employee {
    String name;        // default access
    String jobTitle;    // default access
    double salary;      // default access

    // Constructor
    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }

    // Update salary by percentage increase
    void updateSalary(double percentageIncrease) {
        salary += salary * (percentageIncrease / 100);
    }

    // Display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.printf("Monthly Salary: $%.2f%n", salary);
        System.out.printf("Annual Salary: $%.2f%n", calculateAnnualSalary());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter monthly salary: ");
        double salary = scanner.nextDouble();

        if (salary <= 0) {
            System.out.println("Invalid salary: Please enter a positive number.");
            scanner.close();
            return;
        }

        // Create and show initial details
        Employee employee = new Employee(name, jobTitle, salary);
        System.out.println("\nInitial Details:");
        employee.displayDetails();

        // Salary increase
        System.out.print("\nEnter salary increase percentage: ");
        double increase = scanner.nextDouble();
        if (increase < 0) {
            System.out.println("Invalid percentage: Please enter a non-negative number.");
            scanner.close();
            return;
        }

        // Update & show new details
        employee.updateSalary(increase);
        System.out.println("\nUpdated Details:");
        employee.displayDetails();

        scanner.close();
    }
}
