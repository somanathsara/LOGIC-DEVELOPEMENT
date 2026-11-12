
//Here i uses wrapper class for solving the problem.
import java.util.*;

public class RemoveSpace2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String str = sc.nextLine();
        int i;
        String result = "";
        for (i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!Character.isWhitespace(temp)) {
                result += temp;
            }
            /*
             * or
             * if(Character.isWhitespace(temp)){
             * continue;
             * }
             * else{
             * result += temp;
             * }
             */
        }
        System.out.println(result);
    }
}
