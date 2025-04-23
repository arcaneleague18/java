import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive numbers");
            return;
        }
        
        int answer = (a > b) ? a:b;
        while(true) {
            if(answer % a == 0 && answer % b == 0) {
                break;
            }
            answer++;
        }
        System.out.println("LCM of " + a + " and " + b + " = " + answer);
    }
}