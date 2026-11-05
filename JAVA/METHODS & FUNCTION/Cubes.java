import java.util.*;

class Cubes {
    static int Cubee(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        int res = Cubee(n);
        System.out.println("The cube of the number " + n + " is " + res);
        sc.close();
    }
}