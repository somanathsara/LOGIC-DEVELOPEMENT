// import java.math.*;
import java.util.*;
class Shape{
    double Area(){
        return 0;
    }
}
class Circle extends Shape{
    Scanner sc=new Scanner(System.in);
    double Area(){
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        return Math.PI * r *r;
    }
}
public class Shapes {
    public static void main(String[] args){
        Circle a1 = new Circle();
        double res = a1.Area();
        System.out.println("The area of the circle is:"+res);
    }
}
