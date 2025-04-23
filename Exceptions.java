public class Exceptions{
    public static void main(String args[]){
        int a=0;
        int[] arr = {1,2,3,4,5,6};
        try {
            int d=5/a;
        } catch (ArithmeticException e) {
            System.out.println("Exception arised: "+e);
        }
        
        try{
            arr[10] = a;
            System.out.println("Element at 10th index is: "+arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception arised: "+e);
        }
    }
}