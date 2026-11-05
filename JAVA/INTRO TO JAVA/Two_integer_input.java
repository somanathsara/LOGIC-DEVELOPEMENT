import java.util.Scanner;

class Two_integer_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Addition of two inputted number is:" +(a+b));
        sc.close();
    }

}