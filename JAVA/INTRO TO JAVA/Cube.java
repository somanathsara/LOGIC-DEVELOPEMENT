import java.util.Scanner;

class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        System.out.println("The cube of " + n + " is " + (n * n * n));
        sc.close();
    }
}