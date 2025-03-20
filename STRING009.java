import java.util.*;
public class STRING009 
{
    public static String stringSplosion(String str) 
    {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i <= str.length(); i++) 
        {
            result.append(str.substring(0, i));
        }
        
        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while(t-- > 0)
        {
            String str = scanner.nextLine();
            System.out.println(stringSplosion(str));
        }
    }
}
