
import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        int choice,a,b,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        a = sc.nextInt();
        System.out.println("b: ");
        b = sc.nextInt();

        System.out.println("Choose: + - * /");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                result = a+b;
                System.out.println(result);
                break;
            case 2:
                result = a-b;
                System.out.println(result);
                break;
            case 3:
                result= a*b;
                System.out.println(result);
                break;
            case 4:
                result = a/b;
                System.out.println(result);
                break;
            default:
                System.out.println("Enter valid choice.");
        }
    }
}