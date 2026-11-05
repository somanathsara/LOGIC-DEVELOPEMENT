import java.util.*;
class ComplexNumber{
    Scanner sc = new Scanner(System.in);
    double real1,real2;
    double imag1,imag2;
    ComplexNumber(){
        System.out.println("Enter the real part here for 1st number : ");
        real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part here for 1st number: ");
        imag1 = sc.nextDouble();
        System.out.println("Enter the real part here for 2nd number : ");
        real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part here for 2nd number: ");
        imag2 = sc.nextDouble();
    }
    void Sum(){
        System.out.println("The result is: "+(real1 + real2)+" + "+(imag1 + imag2)+"j");
    }

}
class Complex{
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber();
        c1.Sum();
    }
}