public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is found in the array.");
                return; // Exit the method once found
            }
        }

        System.out.println(target + " is not found in the array.");
    }
}
