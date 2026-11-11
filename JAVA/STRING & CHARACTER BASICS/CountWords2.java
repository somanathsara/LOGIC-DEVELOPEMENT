import java.util.*;
public class CountWords2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line here: ");
        String str = sc.nextLine();
        int words = 0;
        boolean isWord = false;
        for(int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                if(!isWord){
                    words++;
                    isWord = true;
                }
            }
            else{
                isWord = false;
            }
        }
        System.out.println(words);
    }
}
