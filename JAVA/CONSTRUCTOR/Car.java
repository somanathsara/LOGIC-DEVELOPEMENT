import java.util.*;
class Car_data {
    Car_data(String brand, String model, int price){
    System.out.println("Brand: "+brand);
    System.out.println("Model: "+model);
    System.out.println("Price: "+price);
    }
}
class Car{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand name here: ");
        String brand = sc.nextLine();
        System.out.println("Enter model name here: ");
        String model = sc.nextLine();
        System.out.println("Enter price here: ");
        int price = sc.nextInt();
        Car_data c1 = new Car_data(brand, model, price);
        sc.close();


    }

    
}