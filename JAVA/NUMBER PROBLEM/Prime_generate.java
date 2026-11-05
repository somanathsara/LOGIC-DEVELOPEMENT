import java.util.Scanner;

class Prime_generate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point here: ");
        int a = sc.nextInt();
        System.out.println("Enter the end point here: ");
        int b = sc.nextInt();
        int i, j;
        for (i = a; i <= b; i++) {
            boolean prime = true;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0)
                    prime = false;
            }
            if (prime)
                System.out.println(i);
        }
        sc.close();
    }
}