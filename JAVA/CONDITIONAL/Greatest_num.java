import java.util.Scanner;

class Greatest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        int a  = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b  = sc.nextInt();
        System.out.println("Enter the 3rd numbere here: ");
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+ " is gretaer than other.");
        else if(b>c && b>a)
            System.out.println(b + " is greater than other.");
        else if(c>a && c>b)
            System.out.println(c+" is greater than other.");
        sc.close();
    }
}