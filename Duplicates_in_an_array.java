public class Duplicates_in_an_array{
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 4};
        
        // Print unique values
        System.out.println("Unique values in the array:");

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the element has already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the element is not a duplicate, print it
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
