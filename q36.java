package mathoperations;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

package appdemo;

import mathoperations.Calculator;

public class TestApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(5, 3);
        int product = calc.multiply(4, 6);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
