abstract class Shape{
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Circle extends Shape{
    int r = 4;

    public void calculateArea(){
        double area;
        area = 3.14*(r*r);
        System.out.println("Area of circle is: " + area);
    }

    public void calculatePerimeter(){
        double peri = 2*3.14*r;
        System.out.println("Perimeter of circle is: " + peri);
    }
}

class Triangle extends Shape{
    int h = 4, b=5;
    public void calculateArea(){
        double area = 0.5*h*b;
        System.out.println("Area of triangle is: " + area);
    }

    public void calculatePerimeter(){
        int peri = 3*b;
        System.out.println("Perimeter of trianlge is: " + peri);
    }
}

public class Shapes{
    public static void main(String args[]){
        Circle c = new Circle();
        c.calculateArea();
        c.calculatePerimeter();

        Triangle t = new Triangle();
        t.calculateArea();
        t.calculatePerimeter();
    }
}