import java.util.*;

class Product_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int rem, product = 1;
        while (a > 0) {
            rem = a % 10;
            product *= rem;
            a /= 10;
        }
        System.out.println("The products of the digits of the number is " + product);
        sc.close();
    }
}