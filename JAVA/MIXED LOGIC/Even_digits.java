import java.util.*;

class Even_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        int rem, even = 0, odd = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }
        System.out.println("There are total " + even + " number of even digits.");
        System.out.println("There are total " + odd + " number of odd digits");
        sc.close();
    }
}