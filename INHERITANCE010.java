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


    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println(" Price: $" + price);
        System.out.println(" Quantity: " + quantity);
    }
}

class Book extends Product
{
    String author;
    public Book(String name, double price, int quantity, String author)
    {
        super(name, price, quantity);
        this.author = author;
    }
    public double caculateCost(int quantity)
    {
        return price * quantity;
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
    public Electronics(String name, double price, int quantity, String brand)
    {
        super(name, price, quantity);
        this.brand = brand;
    }
    public double calculateCost(int quantity)
    {
        return price * quantity *1.1;
    }
    public void displayDDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Brand: " + brand);
    }
}

class User
{
    String username;
    double totalSpent;

    public User(String username)
    {
        this.username = username;
        this.totalSpent = 0;
    }

    public void buyProduct(Product product, int quantity)
    {
        
       if(quantity <= product.quantity)
       {
            double spent = 0;
            if(product instanceof Book)
            {
                spent = ((Book) product).caculateCost(quantity);
            }
            else if(product instanceof Electronics)
            {
                spent = ((Electronics) product).calculateCost(quantity);
            }
            System.out.println("User: " + username + " bought " + quantity + " " + product.name + " for $" + spent);
            product.quantity -= quantity;
            totalSpent += spent;
       }
       else
       {
        System.out.println("Insufficient quantity of "+  product.name + " available.");
       }
    }
}


public class INHERITANCE010 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0)
        {
            Book book = new Book("Harry Potter", 10, 12, "camnh");
            Electronics laptop = new Electronics("laptop", 20, 10, "Dell");
            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");
            user1.buyProduct(laptop, 3);
            user1.buyProduct(book, 10);
            user2.buyProduct(laptop, 1);
            user3.buyProduct(book, 5);
            System.out.println("====");
            System.out.println("Users with Highest Total Spent:");
            
            Map<String, Double> map = new HashMap<>();
            map.put(user1.username, user1.totalSpent);
            map.put(user2.username, user2.totalSpent);
            map.put(user3.username, user3.totalSpent);
            List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
            list.sort((a,b) -> Double.compare(b.getValue(), a.getValue()));
            int i = 1;
            for(Map.Entry<String, Double> entry : list)
            {
                System.out.println( i + ". " + entry.getKey() + ": $" + entry.getValue());
                i++;
            }
            System.out.println("====");
            laptop.displayDDetails();
            System.out.println("---");
            book.displayDetails();
        }
    }
}
