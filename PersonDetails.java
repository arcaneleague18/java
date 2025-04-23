import java.util.Scanner;

class Person {
    String name;   // package-private access
    int age;       // package-private access
    
    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for Person 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline
        
        System.out.println("\nEnter details for Person 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.close();
        
        if (age1 < 0 || age2 < 0) {
            System.out.println("Invalid age: Please enter non-negative numbers");
            return;
        }
        
        Person person1 = new Person(name1, age1);
        Person person2 = new Person(name2, age2);
        
        System.out.println("\nPerson 1 Details:");
        person1.displayDetails();
        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
    }
}
