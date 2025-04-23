import java.util.Scanner;
class Area{
    int length,breadth;
    public void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return length*breadth;
    }
}

public class Rectangle{
    public static void main(String args[]){
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        a.length = sc.nextInt();
        System.out.print("Breadth: ");
        a.breadth = sc.nextInt();
        System.out.println("Area: "+ a.getArea());

    }
}