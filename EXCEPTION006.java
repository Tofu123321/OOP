
import java.util.*;

class NotContainVoweException extends Exception
{
    public NotContainVoweException(String message)
    {
        super(message);
    }
}

class CheckString
{
    private String s;
   // public static final Set<String> Vowe = new HashSet<>(Array.asList("a", "e","i","o", "u", "A", "E", "I", "O", "U"));
    public CheckString(String s) throws NotContainVoweException
    {
        if(!s.contains("A") && !s.contains("E") && !s.contains("I") && !s.contains("O") && !s.contains("U") && !s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u")  )
        {
            throw new NotContainVoweException("String not contain vowels");
        }
        this.s = s;
    }
    public String toString()
    {
        return "String has vowels";
    }
}

public class EXCEPTION006 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0)
        {
            String s = scanner.nextLine();
            try
            {
                CheckString str = new CheckString(s);
                System.out.println(str);
            }
            catch (NotContainVoweException e)
            {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
