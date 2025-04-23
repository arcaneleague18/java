public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
    }
}