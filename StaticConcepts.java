import java.util.Scanner;

public class StaticConcepts {
    // Static variable
    static int instanceCount = 0;
    
    // Static block
    static {
        System.out.println("Static block executed: Initializing class");
    }
    
    // Instance variable
    private String name;
    
    StaticConcepts(String name) {
        this.name = name;
        instanceCount++;
    }
    
    // Static method
    static void displayInstanceCount() {
        System.out.println("Total instances created: " + instanceCount);
    }
    
    void displayName() {
        System.out.println("Instance name: " + name);
    }
    
    // Static nested class
    static class NestedClass {
        void display() {
            System.out.println("Inside static nested class");
            System.out.println("Can access static variable: " + instanceCount);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name for first instance: ");
        String name1 = scanner.nextLine();
        StaticConcepts obj1 = new StaticConcepts(name1);
        
        System.out.print("Enter name for second instance: ");
        String name2 = scanner.nextLine();
        StaticConcepts obj2 = new StaticConcepts(name2);
        
        obj1.displayName();
        obj2.displayName();
        StaticConcepts.displayInstanceCount();
        
        StaticConcepts.NestedClass nested = new StaticConcepts.NestedClass();
        nested.display();
        
        scanner.close();
    }
}