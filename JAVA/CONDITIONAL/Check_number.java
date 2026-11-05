import java.util.Scanner;

class Check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number wants to test: ");
        int n = sc.nextInt();
        if(n>0)
            System.out.println(n + " is " + "Positive");
        else if(n<0)
            System.out.println(n + " is " + "neagative");
        else
            System.out.println(n);
        sc.close();
        
    }
}