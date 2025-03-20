import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Car {
    protected double price;
    protected int year;
    private static double mostExpensive = 0;
    
    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    
    public abstract double calculateSalePrice();
    
    public static void updateMostExpensive(double price) {
        if (price > mostExpensive) {
            mostExpensive = price;
        }
    }
    
    public static double getMostExpensive() {
        return mostExpensive;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Price: " + df.format(calculateSalePrice()) + " VND | Year: " + year;
    }
}

class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
    }
    
    @Override
    public double calculateSalePrice() {
        double salePrice = price;
        if (year > 2018) {
            salePrice *= 0.8;
        } else if (year > 2010) {
            salePrice *= 0.5;
        } else {
            salePrice *= 0.1;
        }
        Car.updateMostExpensive(salePrice);
        return salePrice;
    }
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }
    
    @Override
    public double calculateSalePrice() {
        double salePrice = price * 1.12 + 20000000;
        Car.updateMostExpensive(salePrice);
        return salePrice;
    }
}

public class INHERITANCE004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String type = data[0];
            double price = Double.parseDouble(data[1]);
            int year = Integer.parseInt(data[2]);
            
            Car car;
            if (type.equals("SC")) {
                car = new SportCar(price, year);
            } else {
                car = new ClassicCar(price, year);
            }
            
            System.out.println(car);
        }
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Most Expensive: " + df.format(Car.getMostExpensive()) + " VND");
        
        scanner.close();
    }
}
