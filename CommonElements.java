import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        
        if (size1 <= 0) {
            System.out.println("Invalid size: Please enter a positive number");
            return;
        }
        
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        
        if (size2 <= 0) {
            System.out.println("Invalid size: Please enter a positive number");
            return;
        }
        
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Common elements:");
        findCommonElements(arr1, arr2);
        
        
    }
    
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        boolean hasCommon = false;
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num); // Avoid duplicates
                hasCommon = true;
            }
        }
        if (!hasCommon) {
            System.out.println("No common elements");
        }
        System.out.println();
    }
}