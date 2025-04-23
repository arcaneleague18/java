class Parent {
    int value = 100;
    
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    int value = 200;
    
    Child() {
        super.display();
    }
    
    void show() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
        super.display();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}