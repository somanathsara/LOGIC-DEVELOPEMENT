import java.io.*;

public class Average2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st number here ");
        float a = Float.parseFloat(br.readLine());
        System.out.print("Enter the 2nd number here; ");
        float b = Float.parseFloat(br.readLine());
        float c = a / b;
        System.out.println("The Average of " + a + " & " + b + " is " + c);

    }
}