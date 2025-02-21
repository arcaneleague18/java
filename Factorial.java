public class Factorial{
    public static void main(String args[]){
        int n=5, res=1;
        for(int i=1;i<=5;i++){
            res*=i;
        }
        System.out.println("Factorial of 5 is "+res);
    }
}