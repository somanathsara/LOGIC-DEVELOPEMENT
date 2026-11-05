import java.io.*;

public class Perimeter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the lentgh of the Rectangle: ");
        double l = Double.parseDouble(br.readLine());
        System.out.print("Enter the breadth of the Rectangle: ");
        double b = Double.parseDouble(br.readLine());
        double p = l * b;
        System.out.print("The Perimeter of the Reactangle is " + p + " squnit");
    }
}