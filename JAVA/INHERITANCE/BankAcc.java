import java.util.*;
class Bank{
    void interest(){
        System.out.println("Hello welcome to SBI");;
    }
}
class Savings extends Bank{
    Scanner sc = new Scanner(System.in);
    void interest(){
        System.out.println("Enter your Amount here: ");
        double amt = sc.nextDouble();
        System.out.println("Enter time here(in year): ");
        double t = sc.nextDouble();
        System.out.println("Enter your rate of interest here: ");
        double r = sc.nextDouble();
        System.out.println("The interes is: "+((amt * t *r)/100));
    }
}
public class  BankAcc{
    public static void main(String[] args){
        Savings s1 = new Savings();
        s1.interest();
    }
}