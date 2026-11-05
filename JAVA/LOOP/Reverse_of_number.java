import java.util.Scanner;

class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        int no = n, rem, r_no = 0;
        while (n > 0) {
            rem = n % 10;
            r_no = r_no * 10 + rem;
            n /= 10;
        }
        System.out.println("The reverse of "+no+ " is " + r_no);
        sc.close();
    }
}