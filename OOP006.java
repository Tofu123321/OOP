class IOException extends Exception
{
    public IOException(String message)
    {
        super(message);
    }
}

class Utils 
{
    public static void z(String s) throws IOException
    {
        System.out.println(2);
        if (s.length() == 1)
            throw new IOException("");
        System.out.println(3);
    }
    public static void u(String s) 
    {
        try 
        {
            System.out.println(s);
            z(s);
            try 
            {
                System.out.println(Integer.parseInt(s)+1);
            } 
            catch (NumberFormatException e) 
            {
                System.out.println(s.toUpperCase());
            }
        } 
        catch (IOException e) 
        {
            System.out.println(1);
        }
    }
}

public class OOP006
{
    public static void main(String[] args) 
    {
        Utils utils;    
    }
}