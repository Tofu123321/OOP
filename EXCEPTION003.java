import java.util.*;

class UsedCarException extends Exception
{
    public UsedCarException(String vin)
    {
        super("Invalid UsedCar: VIN " + vin);
    }
}

class UsedCar 
{
    private String VIN;
    private String make;
    private int year;
    private int mileage;
    private double price;
    private static final Set<String> VALID_MAKES = new HashSet<>(Arrays.asList("Ford", "Honda", "Toyota", "Chrysler"));
    public UsedCar(String VIN, String make, int year, int mileage, double price) throws UsedCarException
    {
        if(VIN.length() != 4 || !VIN.matches("\\d{4}"))
        {
            throw new UsedCarException(VIN);
        }
        if(!VALID_MAKES.contains(make))
        {
            throw new UsedCarException(VIN);
        }
        if(year < 1990 || year > 2014)
        {
            throw new UsedCarException(VIN);
        }
        if(mileage < 0 || price < 0)
        {
            throw new UsedCarException(VIN);
        }
        this.VIN = VIN;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
  
    @Override
    public String toString()
    {
        return "UsedCar{vin='" + VIN + "', make='" + make + "', year=" +year + ", mileage=" + mileage + ", price=" + price + "}";
    }
}

public class EXCEPTION003 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<UsedCar> usedCars = new ArrayList<>();
        scanner.nextLine();
        while(t-- > 0)
        {
            String[] input = scanner.nextLine().split(",");
            String vin = input[0].trim();
            String make = input[1].trim();
            int year = Integer.parseInt(input[2].trim());
            int mileage = Integer.parseInt(input[3].trim());
            double price = Double.parseDouble(input[4].trim());

            try
            {
                UsedCar car = new UsedCar(vin, make, year, mileage, price);
                usedCars.add(car);
            }
            catch(UsedCarException e)
            {
                System.out.println(e.getMessage());
            }
        }    
        System.out.println("List of successfully constructed UsedCar objects:");
            if(usedCars.isEmpty())
            {
                System.out.println("No used cars");
            }
            else
            {
                for(UsedCar car : usedCars)
                {
                    System.out.println(car);
                }
            }
        scanner.close();
    }
}
