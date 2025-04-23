abstract class Employee{
    public abstract void calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee{
    double salary = 100000;
    double tax = 10;
    String role = "Manager";
    public void calculateSalary(){
        double inhand;
        inhand = salary*(1 - (tax/100));
        System.out.println("In hand salary: " + inhand);
    }
    public void displayInfo(){
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
    }
}

class Programmer extends Employee{
    double salary = 50000;
    double tax = 10;
    String role = "Programmer";
    public void calculateSalary(){
        double inhand = salary*(1 - ((tax/100)));
        System.out.println("In hand salary: " + inhand);
    }
    public void displayInfo(){
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
    }
}

public class Abstract_employee{
    public static void main(String args[]){
        Manager m = new Manager();
        Programmer p = new Programmer();
        System.out.println("Details:");

        m.displayInfo();
        m.calculateSalary();
        p.displayInfo();
        p.calculateSalary();
    }
}