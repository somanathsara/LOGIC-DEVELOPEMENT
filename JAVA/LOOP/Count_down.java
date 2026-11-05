import java.util.Scanner;

class Count_down {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from which you want to cont down: ");
        int a = sc.nextInt();
        while (a >= 0) {
            System.out.println(a);
            a--;
        }
        sc.close();
    }
}
