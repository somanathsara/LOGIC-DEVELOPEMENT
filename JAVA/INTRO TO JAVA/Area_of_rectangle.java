import java.util.Scanner;

class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle : " + area);
        sc.close();
    }
}