import java.util.Scanner;

class Continious_num_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows wants to print: ");
        int a = sc.nextInt();
        int i, j, count = 1;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}