import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;
    
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        scanner.close();
        if (rollNo <= 0 || marks < 0) {
            System.out.println("Invalid input: Roll number must be positive, marks non-negative");
            return;
        }
        
        Student student = new Student(name, rollNo, marks);
        System.out.println("\nStudent Details:");
        student.displayDetails();
        
        
    }
}