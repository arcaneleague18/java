class Student{
    int rollno = 6608;
    int age = 19;
    String name = "Viswanath";
}
public class Student_details{
    public static void main(String args[]){
        Student st = new Student();
        System.out.println("Roll No: " + st.rollno);
        System.out.println("Name: "+ st.name);
        System.out.println("Age: "+st.age);
    }
}