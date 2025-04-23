import java.util.Scanner;

class NoVowels extends Exception {
    NoVowels(String message) {
        super(message);
    }
}

public class NoVowelsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        try {
            checkVowels(input);
            System.out.println("String contains vowels");
        } catch (NoVowels e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    static void checkVowels(String str) throws NoVowels {
        if (str == null || str.isEmpty()) {
            throw new NoVowels("String is null or empty");
        }
        if (!str.toLowerCase().matches(".*[aeiou].*")) {
            throw new NoVowels("String does not contain any vowels");
        }
    }
}