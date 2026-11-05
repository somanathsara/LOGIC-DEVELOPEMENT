import java.util.Scanner;

class Perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number wants to check: ");
        int a = sc.nextInt();
        int i, sum = 0;
        for (i = 1; i < a; i++) {
            if (a % i == 0)
                sum += i;
        }
        if (sum == a)
            System.out.println(a + " is Perfect number.");
        else
            System.out.println(a+" is not a Perfect number.");
        sc.close();
    }
}