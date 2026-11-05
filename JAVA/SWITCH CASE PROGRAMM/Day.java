import java.util.Scanner;

class Day {
    static void println(Object value) {
        System.out.println(value);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        println("Enter your day number here(1-7)");
        int a = sc.nextInt();
        switch(a){
            case 1:println("Sunday");break;
            case 2: println("Monday");break;
            case 3:println("Tuesday");break;
            case 4:println("Wednesday");break;
            case 5:println("Thrusday");break;
            case 6:println("Friday");break;
            case 7:println("Saturday");break;
            default:
                println("Please enter valid input");
            } 
        
        sc.close();
    }
}