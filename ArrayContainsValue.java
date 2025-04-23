import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.close();
        if (size <= 0) {
            System.out.println("Invalid size: Please enter a positive number");
            return;
        }
        
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter value to search: ");
        int value = scanner.nextInt();
        
        boolean found = containsValue(arr, value);
        System.out.println("Array " + (found ? "contains" : "does not contain") + " " + value);
        
        
    }
    
    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}