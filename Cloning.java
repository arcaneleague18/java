class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }

    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Cloning{
    public static void main(String args[]){
        Person p1 = new Person("Viswanath",19);
        Person p2 = new Person(p1);
        System.out.println("Original person: ");
        p1.printDetails();
        System.out.println("Cloned person:");
        p2.printDetails();
    }
}