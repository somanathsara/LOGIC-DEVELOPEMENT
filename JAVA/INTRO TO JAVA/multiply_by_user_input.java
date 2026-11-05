import java.util.Scanner;

class multiply_by_user_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st  number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numbere: ");
        int b = sc.nextInt();
        System.out.println("Multiplication of two numbers is: " + (a*b));
        sc.close();
    }
}