import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.close();
        if (size < 0) {
            System.out.println("Invalid size: Please enter a non-negative number");
            return;
        }
        
        int[] arr = new int[size + 1]; // Extra space for insertion
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter position (0-based index): ");
        int pos = scanner.nextInt();
        
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position: Must be between 0 and " + size);
            return;
        }
        
        // Shift elements and insert
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
}