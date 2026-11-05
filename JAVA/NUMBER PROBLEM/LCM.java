import java.util.Scanner;

class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st numbere here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numbere: ");
        int b = sc.nextInt();
        int i ;
        if(a<b)
            i = b;
        else
            i = a;
        while(true){
            if(i%a==0 && i%b==0)
                break;
            i++;
        }
        System.out.println("The LCM of "+a+" & "+b + " is "+i);
        sc.close();
    }
}