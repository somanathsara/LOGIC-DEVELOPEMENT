import java.io.*;

public class CircleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius of the circle: ");
        float r = Float.parseFloat(br.readLine());
        double Area = 3.14 * r * r;
        System.out.print("The Area of the circle is " + Area + " unitsq");
    }
}