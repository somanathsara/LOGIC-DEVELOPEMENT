import java.util.Scanner;
//153  370  371
class Armstrong {
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int original = a, d = 0 ;
        int i;
        while(a>0){
            i = a%10;
            d += i*i*i;
            a/=10;
        }
        if(original == d)
            System.out.println(original+" is a Armstrong number.");
        else
            System.out.println(original + " is not a Armstrong number.");
        sc.close();
    }
}