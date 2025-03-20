import java.util.*;

class Item
{
    String product;
    int unitprice;
    int quantity;

    public Item(String product,  int quantity, int unitprice)
    {
        this.product = product;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }

    public void printItem()
    {
        System.out.println("Product: " + product + " has quantity " + quantity + " with price: " + (unitprice * quantity)); 
    }
}

class Warehouse
{
    private HashMap<String, Integer> productstock;
    private HashMap<String, Item> Items;

    public Warehouse()
    {
        this.productstock = new HashMap<> ();
        this.Items = new HashMap<> ();
    }

    public void importItem(Item item)
    {
        Items.put(item.product, item);
    }

    public void addproduct(String product, int quantity)
    {
        if(!Items.containsKey(product))
        {
            return;
        }

        Item item = Items.get(product);
        int addquantity = Math.min(quantity, item.quantity);
        item.quantity -= addquantity;
        productstock.put(product, productstock.getOrDefault(product, 0) + addquantity);
    }

    public void increaseQuantityInWarehouseByOne()
    {
        for (String product : productstock.keySet())
        {
            Item item = Items.get(product);
            int addquantity = Math.min(1, item.quantity);
            item.quantity -= 1;
            productstock.put(product, productstock.getOrDefault(product, 0) + addquantity);
        }
    }

    public void taketoItem(String product, int quantity)
    {
        int curentquantity = productstock.get(product);
        int takequantity = Math.min(curentquantity , quantity);
        Items.get(product).quantity += takequantity;
    }

}

public class COLLECTION004 
{
    public static void main(String[] args)
    {
        Warehouse warehouse = new Warehouse();
        
        // Tao 2 item
        Item milk = new Item("milk", 4, 2);
        Item buttermilk = new Item("buttermilk", 10, 2);
        milk.printItem();
        buttermilk.printItem();

        // Them 2 item vao kho
        warehouse.importItem(milk);
        warehouse.importItem(buttermilk);
        // milk.printItem();
        // buttermilk.printItem();

        // Them 2 san pham vao kho
        warehouse.addproduct("milk", 1);
        warehouse.addproduct("buttermilk", 3);;
        milk.printItem();
        buttermilk.printItem();

        // Tang so luong san pham trong kho len 1
        warehouse.increaseQuantityInWarehouseByOne();
        milk.printItem();
        buttermilk.printItem();

        // lay san pham tu kho
        warehouse.taketoItem("milk", 5);;
        warehouse.taketoItem("buttermilk",1);
        milk.printItem();
        buttermilk.printItem();

        }
}
