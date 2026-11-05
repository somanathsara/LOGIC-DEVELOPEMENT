import java.util.Scanner;

class Even_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start here: ");
        int a = sc.nextInt();
        System.out.println("Enter the end here: ");
        int b = sc.nextInt();
        int i;
        for(i=a;i<=b;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
        sc.close();
    }
}