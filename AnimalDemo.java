import java.util.Scanner;

class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " eats food.");
    }
    
    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Lion extends Animal {
    Lion(String name) {
        super(name);
    }
    
    @Override
    void eat() {
        System.out.println(name + " eats meat, especially antelope and zebra.");
    }
    
    @Override
    void sound() {
        System.out.println(name + " roars loudly.");
    }
}

class Tiger extends Animal {
    Tiger(String name) {
        super(name);
    }
    
    @Override
    void eat() {
        System.out.println(name + " eats meat, preferring deer and wild boar.");
    }
    
    @Override
    void sound() {
        System.out.println(name + " growls and chuffs.");
    }
}

class Panther extends Animal {
    Panther(String name) {
        super(name);
    }
    
    @Override
    void eat() {
        System.out.println(name + " eats meat, such as small mammals and birds.");
    }
    
    @Override
    void sound() {
        System.out.println(name + " snarls and hisses.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name for Lion: ");
        String lionName = scanner.nextLine();
        System.out.print("Enter name for Tiger: ");
        String tigerName = scanner.nextLine();
        System.out.print("Enter name for Panther: ");
        String pantherName = scanner.nextLine();
        
        Lion lion = new Lion(lionName);
        Tiger tiger = new Tiger(tigerName);
        Panther panther = new Panther(pantherName);
        
        System.out.println("\nLion Details:");
        lion.eat();
        lion.sound();
        
        System.out.println("\nTiger Details:");
        tiger.eat();
        tiger.sound();
        
        System.out.println("\nPanther Details:");
        panther.eat();
        panther.sound();
        
        scanner.close();
    }
}