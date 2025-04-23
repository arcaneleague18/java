import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
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
        
        int newLength = removeDuplicates(arr);
        System.out.println("New length: " + newLength + "where the array length is reduced by removing duplicates, preserving unique elements");
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
    
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : arr) {
            if (set.add(num)) {
                arr[index++] = num;
            }
        }
        return index;
    }
}