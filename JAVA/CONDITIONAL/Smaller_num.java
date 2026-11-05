import java.util.Scanner;

class Smaller_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        if(a<b)
            System.out.println(a + " is Smaller than " + b);
        else
            System.out.println(b + " is smaller than "+a);
        sc.close();
    }
}