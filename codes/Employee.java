public class Employee {
    String name = "Alice Smith";
    String jobTitle = "Developer";
    double salary = 50000;
    
    double calculateSalary() {
        return salary;
    }
    
    void updateSalary(double newSalary) {
        salary = newSalary;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Employee: " + emp.name);
        System.out.println("Job Title: " + emp.jobTitle);
        System.out.println("Current Salary: " + emp.calculateSalary());
        emp.updateSalary(60000);
        System.out.println("Updated Salary: " + emp.calculateSalary());
    }
}