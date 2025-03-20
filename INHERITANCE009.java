import java.util.*;

class Item
{
    String name;
    double price;
    double discount;

    public Item(String name, double price, double discount)
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getDiscount()
    {
        return discount;
    }
    public double getPrice()
    {
        return price;
    }
    public void toString(Item item)
    {
        System.out.println("   " + name + " $" + String.format("%.2f",item.price) + " (-$" + String.format("%.2f",item.discount) + ")");
    }
}

class Employee
{
    String name;
    public Employee(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

class GroceryBill extends Employee
{
    double total;
    ArrayList<Item> items = new ArrayList<Item>();
    public GroceryBill(double total, ArrayList<Item> items, String name)
    {
        super(name);
        this.items = items;
        this.total = total;
    }

    public void add(Item item)
    {
        items.add(item);
        total += item.getPrice();
    }

    public double getTotal()
    {
        return total;
    }
    public String getClerk()
    {
        return name;
    }
    
    public void toString(String name)
    {
        System.out.println("items:");
        for(Item item : items)
        {
            item.toString(item);
        }
        System.out.println("total: $" + String.format("%.2f", total));
        System.out.println("Clerk: " + name);
    }
}

class DiscountBill extends GroceryBill
{
    double discountAmount;
    public DiscountBill(double discountAmount, double total, String name, ArrayList<Item> items)
    {
        super(total, items, name);
        this.discountAmount = discountAmount;
    }
    double subTotal = 0;
    public void add(Item item)
    {
        items.add(item);
        subTotal += item.price;
        discountAmount += item.discount;
    }

    public void toString(String name)
    {
        total = subTotal - discountAmount;
        System.out.println("items:");
        for(Item item : items)

        {
            item.toString(item);
        }
        System.out.println("sub-total: $" + String.format("%.2f", subTotal));
        System.out.println("discount: $" + String.format("%.2f", discountAmount));
        System.out.println("total: $" + String.format("%.2f", total));
        System.out.println("Clerk: " + name);
    }
}

public class INHERITANCE009 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Item item1 = new Item("item 1", 2.3, 0);
        Item item2 = new Item("item 2", 3.45, 0);
        GroceryBill grB = new GroceryBill(0, new ArrayList<Item>(), "Grocery Bill");
        grB.add(item1);
        grB.add(item2);
        grB.toString("Grocery Bill");
        System.out.println();
        Item item3 = new Item( "item 3", 20, 15);
        Item item4 = new Item( "item 4", 40, 35);
        Item item5 = new Item( "item 5", 50, 35);
        DiscountBill Db = new DiscountBill(0, 0, "Discount Bill", new ArrayList<Item>());
        Db.add(item3);
        Db.add(item4);
        Db.add(item5);
        Db.toString("Discount Bill");
    }
}
