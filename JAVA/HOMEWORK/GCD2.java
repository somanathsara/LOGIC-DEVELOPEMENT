import java.io.*;

public class GCD2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st number here: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd number here: ");
        int b = Integer.parseInt(br.readLine());
        int n = a, k = b, i;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.print("The GCD of " + n + " & " + k + " is " + a);

    }
}