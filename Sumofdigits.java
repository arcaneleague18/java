public class Sumofdigits{
    public static void main(String args[]){
        int n=2468, r=0,k;
        int t=n;
        for(int i=0;i<=4;i++){
            k=t%10;
            t=t/10;
            r+=k;
        }
        System.out.println("Sum of digits of "+n+" is "+r);
    }
}