import java.util.*;

class Author
{
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender)
    {
        this.name =name;
        this.email = email;
        this.gender = gender;
    }
}

class Book
{
    String name;
    Author author;
    double price;
    int qty;

    public Book(String name,Author author, double price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    public Book(String name, Author author, double price, int qty)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return getPrice();
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String toString()
    {
        return "Book[name=" + name + ", Author[name=" + author.name + ", email=" + author.email + ", gender=" + author.gender + "], price=" + String.format("%.2f", price) + ", qty=" + qty + "]" ;
    }
}

public class OOP012
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String isBook = sc.nextLine();
            
            String bookName = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();
            String isAuthor = sc.nextLine(); 
            String authorName = sc.nextLine();
            String authorEmail = sc.nextLine();
            char authorGender = sc.nextLine().charAt(0);

            Author author = new Author(authorName, authorEmail, authorGender);
            Book book = new Book(bookName, author, price, qty);
            
        
            String endInput = sc.nextLine();
        
            System.out.println(book);
        }    
    }
}