import java.util.*;

abstract class Shape
{
    protected String name;
    public Shape(String name)
    {
        this.name = name;
    }
    public abstract double calculateArea();
    public void displayInfo()
    {
        System.out.println("Shape:" + name + "|Area:" + String.format("%.2f", calculateArea()));
    }
}

class Rectangle extends Shape
{
    double width;
    double lenght;
    public Rectangle(String name, double width, double lenght)
    {
        super(name);
        this.width = width;
        this.lenght = lenght;
    }
    @Override
    public double calculateArea()
    {
        return width * lenght;
    }
}

class Circle extends Shape
{
    double radius;
    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

public class INHERITANCE007 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            if(input[0].equals("Rectangle"))
            {
                double width = Double.parseDouble(input[1]);
                double lenght = Double.parseDouble(input[2]);
                Shape shape = new Rectangle("Rectangle", width, lenght);
                shape.displayInfo();
            }
            else
            {
                double radius = Double.parseDouble(input[1]);
                Shape shape = new Circle("Circle", radius);
                shape.displayInfo();
            }
        }    
    }
}
