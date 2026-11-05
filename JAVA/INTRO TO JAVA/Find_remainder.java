import java.util.Scanner;

class Find_remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st numbere here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numbere here: ");
        int b = sc.nextInt();
        System.out.println("Remainder of " + a +" & " + b + " is " +(a%b));
        sc.close();
    }
}