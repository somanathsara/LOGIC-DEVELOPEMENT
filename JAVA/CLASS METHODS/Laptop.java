import java.util.*;
class Laptop_data{
    String brand = "";
    String ram = "";
    int price = 0;
    void display(){
        System.out.println("BRAND : "+brand);
        System.out.println("RAM : "+ram);
        System.out.println("PRICE: "+price);
    }
}
public class Laptop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Laptop_data l1 = new Laptop_data();
        l1.brand = "ASUS";
        l1.ram = "16GB";
        l1.price = 84000;
        l1.display();
        sc.close();
    }
}
