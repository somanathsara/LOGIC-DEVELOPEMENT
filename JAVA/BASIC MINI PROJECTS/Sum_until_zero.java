import java.util.*;

class Sum_until_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            sum += n;
            if (n == 0) {
                System.out.println("The sum of all numbers is: " + sum);
                break;
            }
            // else
            // continue;
        }

        sc.close();
    }
}