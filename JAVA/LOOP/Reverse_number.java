import java.util.Scanner;

class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number println: ");
        int a = sc.nextInt();
        System.out.println("Enter the end number: ");
        int b = sc.nextInt();
        int i;
        for (i = b; i >= a; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}