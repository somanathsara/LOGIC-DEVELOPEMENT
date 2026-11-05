import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book name here: ");
        String name = sc.nextLine();
        System.out.println("Enter The Author Name: ");
        String author  = sc.nextLine();
        System.out.println("Enter the price of the Book here: ");
        int price = sc.nextInt();
        Book b1 = new Book(name, author, price);

    }
}
class Book{
    Book(String title, String author, int price){
        System.out.println("Book Name: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Price : "+price);
    }
}
