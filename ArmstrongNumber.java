import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num < 0) {
            System.out.println("Armstrong numbers are not defined for negative numbers");
            return;
        }
        
        boolean isArmstrong = isArmstrong(num);
        System.out.println(num + " is " + (isArmstrong ? "" : "not ") + "an Armstrong number");
        
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}