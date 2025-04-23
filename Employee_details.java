import java.util.Scanner;

class Employee{
    String name,jobtitle;
    float salary;
    float nSalary;
    public Employee(String name, String jobtitle, float salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.nSalary = nSalary;
    }
     public float calculateSalary(int salary){
        return salary;
     }

     public void updateSalary(){
        salary = nSalary;
     }

     public void details(){
        System.out.println("Details:");
        System.out.println("Name: "+ name);
        System.out.println("Job title: "+ jobtitle);
        System.out.println("Salary: "+ salary);
     }
}


public class Employee_details{
    public static void main(String args[]){
        Employee e = new Employee("Viswanath", "Data Scientist", 2500000);
        e.details();
        Scanner sc = new Scanner(System.in);
        System.out.print("New salary: ");
        e.nSalary = sc.nextFloat();
        e.updateSalary();
        e.details();
    }
}