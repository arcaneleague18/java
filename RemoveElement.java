import java.util.Scanner;

public class RemoveElement {
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
        
        System.out.print("Enter element to remove: ");
        int element = scanner.nextInt();
        
        int newSize = removeElement(arr, element);
        System.out.println("Array after removing " + element + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
    
    public static int removeElement(int[] arr, int element) {
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[newSize++] = arr[i];
            }
        }
        return newSize;
    }
}