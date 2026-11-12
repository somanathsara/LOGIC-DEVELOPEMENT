import java.util.*;

abstract class Area {
    abstract void calculateArea();
}

class rectangle extends Area {
    Scanner sc = new Scanner(System.in);

    void calculateArea() {
        System.out.print("Enter the Length of the Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the width of the Rectangle: ");
        double b = sc.nextDouble();
        System.out.println("The Area of the rectangle is : " + (b * l));
    }
}

class Circle extends Area {
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double r = sc.nextDouble();
        System.out.println("The Area of the circle is : " + (3.14 * r * r));
    }
}

class triangle extends Area {
    void calculateArea(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base of the Triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double h = sc.nextDouble();
        System.out.println("The Area of the triangle is : "+(0.5*b*h));
    }
}

public class CalArea {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            println("1.Area of Rectangle");
            println("2.Area of Circle");
            println("3.Area of Triangle");
            println("4.Exit");
            println("Enter your choice : ");
            int choice = sc.nextInt();
            Area obj;
            switch (choice) {
                case 1:
                    obj = new rectangle();
                    obj.calculateArea();
                    break;
                case 2:
                    obj = new Circle();
                    obj.calculateArea();
                    break;
                case 3:
                    obj = new triangle();
                    obj.calculateArea();
                    break;
                case 4:
                    System.exit(0);
                default:
                    println("Please Enter a valid input!");
            }
        }
    }
}
