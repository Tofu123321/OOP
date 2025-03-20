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

    //Them san pham vao kho
    public void addProduct(String product, int price, int stock)
    {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }

    //Mac dinh gia san pham
    public int price(String product)
    {
        return productPrice.getOrDefault(product, -99);
    }
    // La so luong san pham
    public int stock(String product)
    {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product)
    {
        if(productStock.containsKey(product) && productStock.get(product) > 0)
        {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        }
        return false;
    }
}


public class COLLECTION002 
{
    public static void main(String[] args)
    {
        Warehouse wh = new Warehouse();
        wh.addProduct("coffee", 5, 1);
        System.out.println("stock:");
        System.out.println("coffee:  " + wh.stock("coffee"));
        System.out.println("sugar: " + wh.stock("sugar"));
        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking sugar " + wh.take("sugar"));
        System.out.println("stock:");
        System.out.println("coffee:  " + wh.stock("coffee"));
        System.out.println("sugar: " + wh.stock("sugar"));
    }
}
