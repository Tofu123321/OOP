import java.util.*;

class Product
{
    String name;
    double price;
    int quantity;
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
    }
    public double caculateCost(int quantity)
    {
        this.quantity -= quantity;
        return quantity * price;
    }
}

class Book extends Product
{
    String author;
    public Book(String author, String name, double price, int quantity)
    {
        super(name, price, quantity);
        this.author = author;
    }
    public double caculateCost(int quantity)
    {
        this.quantity -= quantity;
        return quantity * price;
    }
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Author: " + author);
    }
}

class Electronics extends Product
{
    String brand;
    public Electronics(String brand, String name, double price, int quantity)
    {
        super(name, price, quantity);
        this.brand = brand;
    }
    public double caculateCost(int quantity)
    {
        this.quantity -= quantity;
        return quantity * price * 1.1;
    }
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("brand: " + brand);
    }
    public void buyProduct(int i)
    {
        this.quantity -= i;
    }
}

class User
{
    String userName;
    double totalSpent;
    public User(String userName)
    {
        this.userName = userName;
        this.totalSpent = 0;
    }

    public void buyProduct(Product product, int quantity)
    {
        if(quantity <= product.quantity)
        {
            double price = product.caculateCost(quantity);
            this.totalSpent += price;
            System.out.println("User: " + userName + " bought " + quantity + " " + product.name + " for $" + price);
           // User: Alice bought 3 laptop for $66.0
        }
        else
        {
           // Insufficient quantity of {product_name} available.
           System.out.println("Insufficient quantity of " + product.name + " available.");
        }
    }
}

public class OOP017 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            Book book = new Book("camhh", "Harry Potter", 10, 12);    
            Electronics electronic = new Electronics("Dell", "laptop", 20, 10);
            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");
            user1.buyProduct(electronic, 3);
            user1.buyProduct(book, 10);
            user2.buyProduct(electronic, 1);
            user3.buyProduct(book, 5);
            System.out.println("====");
            Map<Double, String> users = new TreeMap<>(Collections.reverseOrder());
            users.put(user1.totalSpent, user1.userName);
            users.put(user2.totalSpent,user2.userName);
            users.put(user3.totalSpent, user3.userName);
            int i = 1;
            System.out.println("Users with Highest Total Spent:");
            for(Map.Entry<Double, String> entry : users.entrySet())
            {
                System.out.println(i + ". " + entry.getValue() + ": $" + entry.getKey());
            }
            System.out.println("====");
            electronic.displayDetails();
            System.out.println("---");
            book.displayDetails();
        }
        scanner.close();
    }
}
