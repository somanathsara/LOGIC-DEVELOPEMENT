import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        System.out.println("The factors are: ");
        int i;
        for(i=1;i<=a;i++){
            if(a%i==0)
                System.out.println(i);
            }
        sc.close();
    }
}