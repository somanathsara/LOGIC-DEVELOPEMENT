import java.util.*;
import java.math.*;

class Area_c{
     double Area_c(double r){
        return 3.14 * r *r;
    }
}
public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area_c a1 = new Area_c();
        System.out.println("Enter the radius of the Circle: ");
        double r = sc.nextDouble();
        double res = a1.Area_c(r);
        System.out.println("The Area of the circle is: "+Math.round(res));
        sc.close();
    }
}
