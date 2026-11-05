import java.util.*;

class Car {
    Scanner sc = new Scanner(System.in);
    String Brand;
    String Model;
    String price;

    Car() {
        System.out.println("Enter the Car Brand here: ");
        Brand = sc.nextLine();
        System.out.println("Enter the Car Model here: ");
        Model = sc.nextLine();
        System.out.println("Enter the Car Price here: ");
        price = sc.nextLine();
    }

    void display() {
        System.out.println("The Brand name: " + Brand);
        System.out.println("The Model name: " + Model);
        System.out.println("The Price: " + price);
    }
}

public class Car_class {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}