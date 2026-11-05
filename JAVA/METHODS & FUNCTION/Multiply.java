import java.util.*;

class Multiply {
    static int Mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        int res = Mul(a, b);
        System.out.println("The multiplication of " + a + " & " + b + " is " + res);
        sc.close();
    }
}