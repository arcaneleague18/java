public class OddNumberException {
    static void checkNumber(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd: " + num);
        }
        System.out.println("Number is even: " + num);
    }
    
    public static void main(String[] args) {
        try {
            checkNumber(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}