
interface TacoBox
{
    int tacoRemaining();
    void eat();
}

class TripleTacoBox implements TacoBox
{
    private int tacos;
    public TripleTacoBox(int tacos)
    {
        this.tacos = tacos;
    }
    public int tacoRemaining()
    {
        return tacos;
    }
    public void eat()
    {
        if(tacos > 0)
        {
            tacos -= 1;
        }
        else
            tacos = 0;
    }

}

class CustomTacoBox implements TacoBox
{
    int tacos;
    public CustomTacoBox(int tacos)
    {
        this.tacos = tacos;
    }
    public int tacoRemaining()
    {
        return tacos;
    }
    public void eat()
    {
        if(tacos > 0)
        {
            tacos -= 1;
        }
        else
            tacos = 0;
    }
}

public class INTERFACE003 
{
    public static void main(String[] args)
    {
        TripleTacoBox tripTaco = new TripleTacoBox(3);
        CustomTacoBox cusTaco = new CustomTacoBox(8);
        tripTaco.eat();
        tripTaco.eat();
        cusTaco.eat();
        System.out.println("Triple taco boxes left: " + tripTaco.tacoRemaining());
        System.out.println("Custom taco boxes left: " + cusTaco.tacoRemaining());
    }
}
