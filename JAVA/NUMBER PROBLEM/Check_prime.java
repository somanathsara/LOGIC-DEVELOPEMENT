import java.util.Scanner;

class Check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        boolean prime = true;
        int a = sc.nextInt();
        int i;
        for (i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(a + " is prime.");
        else
            System.out.println(a + " is not prime.");
        sc.close();
    }
}