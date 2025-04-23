public class Odd_exceptions{
    public static void main(String args[]){
        int a = 5;
        try {
            if(a%2!=0){
                throw new Exception("OddNumberException");
            }
            else{
                System.out.println(a);
            }
        } catch (Exception e) {
            
            System.out.println("Exception:"+e);
        }
    }
}