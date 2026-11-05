import java.util.Scanner;

class Square_from_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        System.out.println("The square of the number is :"+(n*n));
        sc.close();
    }
}