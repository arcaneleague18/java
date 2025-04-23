final class FinalClass {
    final int finalVariable = 100;
    
    final void finalMethod() {
        System.out.println("This is a final method with final variable: " + finalVariable);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.finalMethod();
    }
}