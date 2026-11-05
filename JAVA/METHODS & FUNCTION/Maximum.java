import java.util.*;

class Maximum {
    static int Maximum(int a, int b, int c) {
        int max;
        max = (a > b && a > c) ? a : (b > c && b > a) ? b : c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numbere: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number here: ");
        int c = sc.nextInt();
        int res = Maximum(a, b, c);
        System.out.println(res + " is greater");
        sc.close();

    }
}