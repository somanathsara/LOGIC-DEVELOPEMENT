import java.util.*;
class Simple_calculator{
    static void println(Object value){
        System.out.println(value);
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        println("Enter 1st number here: ");
        double a  = sc.nextDouble();
        println("Enter 2nd number here: ");
        double  b = sc.nextDouble();
        println("Enter the operation here: ");
        char op = sc.next().charAt(0);
        switch(op){
            case  '+':
                println("The addition of "+a+" & "+b+" is "+(a+b));
                break;
            case '-':
                println("The subtraction of "+a+" & "+b+" is "+(a-b));
                break;
            case '*':
                println("The multiplication of "+a +" & "+b+" is "+(a*b));
                break;
            case '/':
                if(b==0)
                    println("Division is not possible.");
                else{
                    println("The division of "+a+" & "+b+" is "+(a/b));
                }
                break;
            case '%':
                println("The remainder of "+a+"when divided by "+b+" is "+(a%b));
                break;
            default:
                println("Please enter valid input!");
        sc.close();
        }
        
    }
}