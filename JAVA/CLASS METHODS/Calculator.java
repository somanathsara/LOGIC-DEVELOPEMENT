import java.util.*;
class Calculator_func{
    float Add(float a, float b){
        return (a+b);
    }
    float Sub(float a, float b){
        return (a-b);
    }
    float Mul(float a, float b){
        return (a*b);
    }
    float div(float a, float b){
        if(b == 0){
            System.out.println("Division by 0 is not possbile.");
            return 0;
        }
        else{
            return (a/b);
        }
    }
}

class Calculator {
    static void print(Object value){
        System.out.println(value);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator_func c1 = new Calculator_func();
        print("-----START-----");
        while(true){
            print("1.For Addition.");
            print("2.For Subtraction.");
            print("3.For Multiplication.");
            print("4.For Division.");
            print("5.For Exit.");
            print("Enter your choice: ");
            int choice  = sc.nextInt();
            if(choice == 5){
                System.exit(0);
            }
            print("Enter 1st item for the operation: ");
            float a = sc.nextFloat();
            print("Enter 2nd item for the operation: ");
            float b = sc.nextFloat();
            float res;
            switch(choice){
                case 1:
                   res =  c1.Add(a,b);
                   print("The Result of the Operation is: "+res);
                   break;
                case 2:
                    res = c1.Sub(a,b);
                    print("The Result of the Operation is: "+res);
                    break;
                case 3:
                    res = c1.Mul(a,b);
                    print("The Result of the Operation is: "+res);
                    break;
                case 4:
                    res = c1.div(a,b);
                    if(res!=0){
                    print("The Result of the Operation is: "+res);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    print("please Enter a valid choice!");

            }

        }
        // sc.close();
    }
}
