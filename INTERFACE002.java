import java.util.*;

interface Movable
{
    void move(int dx, int dy);
}

class Organism implements Movable
{
    protected int x;
    protected int y;
    public Organism(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String toString()
    {
        return "x:" + x + ";y:" + y;
    }
}

class Herd implements Movable
{
    private List<Movable> organisms;
    public Herd()
    {
       organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable)
    {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy)
    {
        for (Movable movable : organisms) 
        {
            movable.move(dx, dy);
        }
    }
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (Movable movable : organisms)
        {
            result.append(movable.toString()).append("\n");
        }
        return result.toString().trim();
    }
}

public class INTERFACE002 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Herd herd = new Herd();
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Organism organism = new Organism(x,y);
            herd.addToHerd(organism);
        }
        herd.move(1,1);
        System.out.println(herd.toString());
    }   
}
