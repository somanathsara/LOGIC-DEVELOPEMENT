import java.io.*;
public class mYNAME{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String name = br.readLine();
        System.out.println("Hello "+name);
    }
}