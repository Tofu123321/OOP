import java.util.*;

class Warehouse
{
    private HashMap<String, Integer> productPrice;
    private HashMap<String, Integer> productStock;

    public Warehouse()
    {
        this.productPrice = new HashMap<> ();
        this.productStock = new HashMap<> ();
    }

    // Them san pham va kho
    public void addProduct(String product, int price, int stock)
    {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }

    // Lay gia san pham
    public int price(String product)
    {
        return productPrice.getOrDefault(product, -99);   
    }
}

public class COLLECTION001 
{    
    public static void main(String[] args)
    {
        Warehouse warehouse = new Warehouse();

        // Them san pham vao kho
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        // Output
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
    }
}
