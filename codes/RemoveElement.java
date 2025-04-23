public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int elementToRemove = 30;
        int newLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }
        
        System.out.println("Array after removing " + elementToRemove + ":");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}