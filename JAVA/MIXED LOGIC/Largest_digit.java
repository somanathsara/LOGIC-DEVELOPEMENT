import java.util.*;

class Largest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int a = sc.nextInt();
        int max = 0, rem;
        while (a > 0) {
            rem = a % 10;
            if (rem > max)
                max = rem;
            a /= 10;
        }
        System.out.println("The largest digit from your inputed number is " + max);
        sc.close();

    }
}
