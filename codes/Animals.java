class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
    
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }
    
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats meat");
    }
    
    void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther extends Animal {
    void eat() {
        System.out.println("Panther eats meat");
    }
    
    void sound() {
        System.out.println("Panther snarls");
    }
}

public class Animals {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();
        
        lion.eat();
        lion.sound();
        tiger.eat();
        tiger.sound();
        panther.eat();
        panther.sound();
    }
}