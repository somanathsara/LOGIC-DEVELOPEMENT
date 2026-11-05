import java.util.Scanner;

class Divide_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        System.out.println("Division of " + a + " & " + b + " is " + (a / b));
        sc.close();
    }
}