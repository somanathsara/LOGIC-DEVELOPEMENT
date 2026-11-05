import java.util.*;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name here: ");
        String name = sc.nextLine();
        System.out.println("Enter the Product price here: ");
        int price = sc.nextInt();
        System.out.println("Enter the number of product here: ");
        int quantity = sc.nextInt();
        Prod_data c1 = new Prod_data(name, price, quantity);
        c1.totalPrice();

    }
}

class Prod_data {
    int price;
    int quantity;
    String name;
    Prod_data(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Product name: " + this.name);
        System.out.println("Price :" + this.price);
        System.out.println("Quantity :" + this.quantity);
    }

    void totalPrice() {
        System.out.println("Total Price : " + (price*quantity));
    }
}