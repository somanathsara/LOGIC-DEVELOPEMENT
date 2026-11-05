import java.util.Scanner;

class Farenhit_to_cel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thhe temperature in Farenhit: ");
        double Farenhit = sc.nextDouble();
        double cel = 5*(Farenhit - 32)/9;
        System.out.println("The temperature in celcius is: "+cel);
        sc.close();
    }
}