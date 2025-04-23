class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Person_details{
    public static void main(String args[]){
        Person p1 = new Person("Viswanath",19);
        Person p2 = new Person("Aditya",19);
        p1.printDetails();
        p2.printDetails();
    }
}