import java.util.*;

class Simple_interest {
    static void println(Object value) {
        System.out.println(value);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    println("Enter your principle Amout here: ");
    int p = sc.nextInt();
    println("Enter your rate of interest: ");
    double r = sc.nextDouble();
    println("Enter the time here: ");
    double t = sc.nextDouble();
    double s_int = (p*t*r)/100;
    println("The simple interest from your provided data is: "+s_int);
    sc.close();
    }
}