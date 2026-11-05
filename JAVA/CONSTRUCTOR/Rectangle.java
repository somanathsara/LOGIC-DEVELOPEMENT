import java.util.*;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length here: ");
        int len = sc.nextInt();
        System.out.println("Enter the width here: ");
        int wid = sc.nextInt();
        Area a1 = new Area(len, wid);
        sc.close();

    }
}

class Area {
    Area(int len, int wid) {
        System.out.println("Area: " + len * wid);
    }
}