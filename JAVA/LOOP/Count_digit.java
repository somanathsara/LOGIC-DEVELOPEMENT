import java.util.Scanner;

class Count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int count = 0;
        while (a > 0) {
            count++;
            a /= 10;
        }
        System.out.println("There are " + count + " digit in your number.");
        sc.close();
    }
}