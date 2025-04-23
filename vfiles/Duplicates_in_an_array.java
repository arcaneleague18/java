public class Duplicates_in_an_array{
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {20,20,30,40,50,50,50};
        int[] newarr = new int[100];
        int k=0;
        
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
                newarr[k++] = arr[i];
                // System.out.print(arr[i] + " ");
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(newarr[i]);
        }
        System.out.println("Length of new array = "+k);
    }
}
