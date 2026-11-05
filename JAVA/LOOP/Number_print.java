import java.util.Scanner;

class Number_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting of the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the end number here: ");
        int b = sc.nextInt();
        int i;
        for (i = a; i <= b; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}