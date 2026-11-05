import java.util.Scanner;

class Star {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows wants to print: ");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int i, j;
        for(i=1;i<=a;i++){
            for(j=1;j<=a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}