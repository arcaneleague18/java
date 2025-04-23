class Student{
    int rollno = 69;
    int age = 19;
    String name = "seaman";
}
public class StudentDetails{
    public static void main(String args[]){
        Student st = new Student();
        System.out.println("Roll No: " + st.rollno);
        System.out.println("Name: "+ st.name);
        System.out.println("Age: "+st.age);
    }
}