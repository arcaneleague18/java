import java.util.Scanner;

class Student {
    String name; // package-private access
    int id;      // package-private access
    
    // Constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Copy constructor for cloning
    Student(Student original) {
        this.name = original.name;
        this.id = original.id;
    }
    
    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class ObjectCloning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.close();
        
        if (id <= 0) {
            System.out.println("Invalid ID: Please enter a positive number");
            return;
        }
        
        // Create and clone the student object
        Student original = new Student(name, id);
        Student clone = new Student(original);
        
        // Display details of original and cloned student
        System.out.println("Original Student:");
        original.display();
        System.out.println("Cloned Student:");
        clone.display();
    }
}
