import java.util.*;
class Area{
     int Area(int l, int w){
        return l*w;
    }
}


public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area a1 = new Area();
        System.out.print("Enter the length of the Rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the width of the Rectangle: ");
        int w = sc.nextInt();
        int res = a1.Area(l,w);
        sc.close();
        System.out.println("The Area of the Rectangle is:"+res);

    }
}
