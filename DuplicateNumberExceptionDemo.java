import java.util.HashSet;
import java.util.Scanner;

class Duplicate extends Exception {
    Duplicate(String message) {
        super(message);
    }
}

public class DuplicateNumberExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of integers: ");
        int size = scanner.nextInt();
        scanner.close();
        if (size <= 0) {
            System.out.println("Invalid size: Please enter a positive number");
            return;
        }
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        try {
            checkDuplicates(numbers);
            System.out.println("No duplicates found");
        } catch (Duplicate e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
    
    static void checkDuplicates(int[] numbers) throws Duplicate {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                throw new Duplicate("Duplicate number found: " + num);
            }
        }
    }
}