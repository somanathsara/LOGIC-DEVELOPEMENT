import java.io.*;

public class Sum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st number here: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the 2nd number here: ");
        int b = Integer.parseInt(br.readLine());
        int c = a + b;
        System.out.println("The sum of " + a + " & " + b + " is " + c);
    }
}