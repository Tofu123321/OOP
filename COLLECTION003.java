import java.util.*;
class Warehouse
{
    private HashMap<String, Integer> stockMap;
    private HashMap<String, Integer> priceMap;

    public Warehouse() 
    {
        stockMap = new HashMap<>();
        priceMap = new HashMap<>();
    }
    public void addProduct(String productName, int stock, int price) 
    {
        stockMap.put(productName, stock);
        priceMap.put(productName, price);
    }

    public int price(String product)
    {
        return priceMap.getOrDefault(product, -99);
    }
    public int stock(String product) 
    {
        return stockMap.getOrDefault(product, 0);
    }
    public boolean take(String product)
    {
        if(stockMap.containsKey(product))
        {
            int stock = stockMap.get(product);
            if(stock > 0)
            {
                stockMap.put(product, stock - 1);
                return true;
            }
            else
            {
                stockMap.put(product, 0);
                return true;
            }
        }
        else
        {
            return false;
        }
    }
    public Set<String> getProducts()
    {
        return stockMap.keySet();
    }
}


public class COLLECTION003 
{
    public static void main(String[] args)
    {
        Warehouse warehouse = new Warehouse();

        // Thêm các sản phẩm vào kho
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 2);
        warehouse.addProduct("yogurt", 2, 20);

        // Thực hiện lấy các sản phẩm
        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");

        // In ra các sản phẩm còn lại trong kho
        Set<String> products = warehouse.getProducts();
        for (String product : products) 
        {
            int stock = warehouse.stock(product);
            if (stock > 0) 
            { // Chỉ in ra những sản phẩm còn tồn kho
                System.out.println(product);
            }
        }
    }
}


