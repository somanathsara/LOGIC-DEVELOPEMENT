import java.util.*;
import java.math.*;
public class Point {
    public static void main(String[] args){
        Point_dist p1 = new Point_dist();
        p1.distanceFromOrigin();
    }
}
class Point_dist{
    double x, y;
    Point_dist(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate here: ");
        x = sc.nextDouble();
        System.out.println("Enter y coordinate here: ");
        y = sc.nextDouble();
    }
    void distanceFromOrigin(){
        double dis = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
        System.out.println("The distance of point from origin is: "+dis);

    }
}