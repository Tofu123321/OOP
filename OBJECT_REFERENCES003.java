import java.util.*;

public class OBJECT_REFERENCES003 
{
    public static boolean check(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        if(s1.equals(s2))
            return true;
        return false;    
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(check(s1, s2));
        }
    }    
}
