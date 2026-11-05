import java.util.*;


class Division {
    static double Div(double a, double b){
        if (b != 0)
            return (a/b);
        else
            System.out.println("division by 0 is not possbible");
            System.exit(0);
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        double a = sc.nextDouble();
        System.out.println("Enter the 2nd number here: ");
        double b = sc.nextDouble();
        double res = Div(a, b);
        System.out.println("The division of " + a + " & " + b + " is " + res);
        sc.close();
    }
}