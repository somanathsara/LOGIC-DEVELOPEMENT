import java.util.Scanner;

class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbere here: ");
        int a = sc.nextInt();
        int original = a;
        int rem, reverse = 0;
        while (a > 0) {
            rem = a % 10;
            reverse = reverse * 10 + rem;
            a /= 10;
        }
        if (original == reverse)
            System.out.println(original + " is palindrome.");
        else
            System.out.println(original + " is not palindrome.");
        sc.close();
    }
}