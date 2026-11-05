import java.util.Scanner;

class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int rem, sum = 0;
        while (a > 0) {
            rem = a % 10;
            sum += rem;
            a /= 10;
        }
        System.out.println("The sum of the digit of the given number is: " + sum);
        sc.close();
    }
}