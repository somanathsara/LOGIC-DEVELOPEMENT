import java.util.Scanner;

class Count_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbere here: ");
        int a = sc.nextInt();
        int i;
        int count = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }
        System.out.println("The total number of factor is " + count);
        sc.close();
    }
}