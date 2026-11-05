import java.io.*;
public class multiply2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st number here: ");
        float a = Float.parseFloat(br.readLine());
        System.out.print("Enter the 2nd number here: ");
        float b = Float.parseFloat(br.readLine());
        float c = a * b;
        System.out.println("The Multiplication of 2 number is " + c);
    }
}
