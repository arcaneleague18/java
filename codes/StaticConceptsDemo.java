public class StaticConceptsDemo {
    // (a) Static variable
    static int counter = 0;
    
    // (c) Static block
    static {
        System.out.println("Static block executed: Initializing counter to 10");
        counter = 10;
    }
    
    // (b) Static method
    static void displayCounter() {
        System.out.println("Current counter value: " + counter);
    }
    
    // (d) Static nested class
    static class NestedStaticClass {
        void showMessage() {
            System.out.println("Message from static nested class. Counter: " + counter);
        }
    }
    
    public static void main(String[] args) {
        // Accessing static variable and method directly
        System.out.println("Initial counter: " + counter);
        displayCounter();
        
        // Incrementing static variable
        counter++;
        displayCounter();
        
        // Creating instance of static nested class
        NestedStaticClass nestedObj = new NestedStaticClass();
        nestedObj.showMessage();
    }
}