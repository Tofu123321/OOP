import java.util.*;


public class STRING001 
{
    public static boolean check(String s1, String s2)
    {
        String[] parts = s1.split(" ");
        for(String part : parts)
        {
            if(part.equals(s2))
            {
                return true;
            }
        }
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
