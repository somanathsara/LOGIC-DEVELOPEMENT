import java.util.*;

class Shopping {
    String name = "";
    int price = 0;
    int quantity = 0;

    void calculateTotal() {
        System.out.println("Total Amout of the product :" + (price * quantity));
    }
}

class Shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping c1 = new Shopping();
        System.out.println("Enter the Item Name :");
        c1.name = sc.nextLine();
        System.out.println("Enter the Item price :");
        c1.price = sc.nextInt();
        System.out.println("Enter the Item quantity :");
        c1.quantity = sc.nextInt();
        c1.calculateTotal();
        sc.close();

    }
}