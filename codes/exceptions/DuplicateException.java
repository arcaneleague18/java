import java.util.Scanner;

class Duplicate extends Exception {
    Duplicate(String message) {
        super(message);
    }
}

public class DuplicateException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

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

        scanner.close();
    }
}
