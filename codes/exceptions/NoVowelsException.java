class NoVowels extends Exception {
    NoVowels(String message) {
        super(message);
    }
}

public class NoVowelsException {
    public static void main(String[] args) {
        String input = "rhythm";
        
        try {
            checkVowels(input);
            System.out.println("String contains vowels: " + input);
        } catch (NoVowels e) {
            System.out.println("Error: " + e.getMessage());
        }
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