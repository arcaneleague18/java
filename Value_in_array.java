import java.util.Scanner;

public class Value_in_array{
    public static void main(String args[]){
        int m[][] = {{10,56,44},{32,89,100},{2,11,90}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be found: ");
        int val = sc.nextInt();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[i][j] == val){
                    System.out.println("Value found!!");
                    return;
                }
            }
        }
        System.out.println("Value not found.");
        return;

    }
}