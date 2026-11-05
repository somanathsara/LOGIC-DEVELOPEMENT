import java.util.*;

class Square {
    static int Sq(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number here: ");
        int n = sc.nextInt();
        int res = Sq(n);
        System.out.println("The Square of " + n + " is " + res);
        sc.close();
    }
}