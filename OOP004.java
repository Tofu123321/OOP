import java.util.*;

class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public double  distanceTo(Point p)
    {
        double distance;
        distance = Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
        return distance;
    }
}

public class OOP004 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0)
        {
            String[] input = scanner.nextLine().split(" ");
            int xA = Integer.parseInt(input[0]);
            int yA = Integer.parseInt(input[1]);
            int xB = Integer.parseInt(input[2]);
            int yB = Integer.parseInt(input[3]);
            Point A = new Point(xA, yA);
            Point B = new Point(xB, yB);
            A.move(1,1);
            double distance = A.distanceTo(B);
            System.out.println(String.format("%.2f", distance));
        }
    }
}
