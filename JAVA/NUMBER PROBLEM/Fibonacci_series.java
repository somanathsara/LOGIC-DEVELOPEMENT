import java.util.Scanner;

class Fibonacci_series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print: ");
        int a = 0, b = 1,c;
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
            i++;
        }
        sc.close();
    }
}