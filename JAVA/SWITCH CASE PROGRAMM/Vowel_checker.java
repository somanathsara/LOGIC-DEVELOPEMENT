import java.util.Scanner;

class Vowel_checker {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        println("Enter your choice: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                println("vowel");
                break;
            default:
                println("Not Vowel!");

        }
        ;
        sc.close();
    }
}