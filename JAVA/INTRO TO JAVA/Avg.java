import java.util.Scanner;

class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number here: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd number here: ");
        double b = sc.nextDouble();
        double avg = (a + b) / 2;
        System.out.println("Average of 2 number is : " + avg);
        sc.close();

    }
}