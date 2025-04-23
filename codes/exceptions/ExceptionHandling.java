public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        }
    }
}