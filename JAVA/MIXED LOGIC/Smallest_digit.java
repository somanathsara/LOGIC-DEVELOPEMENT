import java.util.*;

class Smallest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt(), rem, min = 9;
        while (n > 0) {
            rem = n % 10;
            if (rem < min)
                min = rem;
            n /= 10;
        }
        System.out.println("The smallest digit in this number is " + min);
        sc.close();
    }
}