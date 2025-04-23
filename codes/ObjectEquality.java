public class ObjectEquality {
    int value;
    
    ObjectEquality(int value) {
        this.value = value;
    }
    
    boolean equals(ObjectEquality other) {
        return this.value == other.value;
    }
    
    public static void main(String[] args) {
        ObjectEquality obj1 = new ObjectEquality(100);
        ObjectEquality obj2 = new ObjectEquality(100);
        ObjectEquality obj3 = new ObjectEquality(200);
        
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3));
    }
}