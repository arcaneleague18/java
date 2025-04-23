class Duplicate extends Exception {
    Duplicate(String message) {
        super(message);
    }
}

public class DuplicateException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4};
        
        try {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        throw new Duplicate("Duplicate number found: " + numbers[i]);
                    }
                }
            }
            System.out.println("No duplicates found");
        } catch (Duplicate e) {
            System.out.println(e.getMessage());
        }
    }
}