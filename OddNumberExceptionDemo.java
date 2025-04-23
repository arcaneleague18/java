import java.util.Scanner;

class OddNumberException extends Exception {
    OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            checkEven(number);
            System.out.println(number + " is even");
        } catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number");
        }
    }
}