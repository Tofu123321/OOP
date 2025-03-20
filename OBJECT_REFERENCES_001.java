import java.util.*;
public class OBJECT_REFERENCES_001 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String index = s.replaceAll("[^0-9]", "");
        int Index = 0;
        if(index.isEmpty())
        {
            Index = 0;
        }
        else
        {
           Index = Integer.parseInt(index);
        }
       //  System.out.println(Index);
        if(i == Index)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
