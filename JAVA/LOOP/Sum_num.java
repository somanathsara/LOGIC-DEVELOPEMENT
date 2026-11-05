import java.util.Scanner;

class Sum_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num upto which have to sum: ");
        int a = sc.nextInt();
        int i;
        int sum = 0;
        for (i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("The sum from 1 to " + a + " is " + sum);
        sc.close();
    }
}