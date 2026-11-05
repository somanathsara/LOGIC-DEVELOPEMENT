import java.util.*;

class Cel_to_farenhit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        double cel = sc.nextDouble();
        double Farenhit = 9*(cel/5)+32;
        System.out.println("The temperature in  Farenhit is: "+Farenhit);
        sc.close();
    }
}