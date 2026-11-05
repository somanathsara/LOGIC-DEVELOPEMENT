import java.util.*;

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number here: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isEven(n);
        if (res)
            System.out.println("The given number is Even");
        else
            System.out.println("The given number is Odd");
        sc.close();
    }
}