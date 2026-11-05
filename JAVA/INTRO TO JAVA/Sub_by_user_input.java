import java.util.Scanner;

class Sub_by_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st numbere here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        System.out.println("Subtraction of Two number is :" + (a - b));
        sc.close();
    }
}