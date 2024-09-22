/*
Sample Input

The following input from stdin is handled by the locked stub code in your editor:

    The Alchemist
    Paulo Coelho
    248
    Sample Output

The following output is printed by your display() method:

    Title: The Alchemist
    Author: Paulo Coelho
    Price: 248
 */
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book{
    int price;
    public MyBook(String title1,String auther,int price) {
        super(title1,auther);
        this.price=price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    
}

public class BookAuther {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}