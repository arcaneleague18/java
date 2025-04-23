import java.util.Scanner;

final class ImmutableClass {
    // Final variable
    final int CONSTANT_VALUE;
    
    ImmutableClass(int value) {
        CONSTANT_VALUE = value;
    }
    
    // Final method
    final void displayConstant() {
        System.out.println("Constant Value: " + CONSTANT_VALUE);
    }
}

class DerivedClass {
    void tryOverride() {
        System.out.println("This method cannot override a final method.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a constant value for ImmutableClass: ");
        int value = scanner.nextInt();
        scanner.close();
        if (value <= 0) {
            System.out.println("Invalid value: Please enter a positive number");
            return;
        }
        
        ImmutableClass obj = new ImmutableClass(value);
        obj.displayConstant();
        
        DerivedClass derived = new DerivedClass();
        derived.tryOverride();
        
        // Final variable in main
        final int LOCAL_CONSTANT = 100;
        System.out.println("Local final variable: " + LOCAL_CONSTANT);
        
        
    }
}