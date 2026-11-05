import java.util.Scanner;

class Find_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int i, fact = 1;
        for (i = a; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial of " + a + " is " + fact);
        sc.close();
    }
}