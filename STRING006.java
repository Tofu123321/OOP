import java.util.*;

public class STRING006 
{
    public static void findUpperCase(String input)
    {
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        for(char c : charArray)
        {
            if(Character.isUpperCase(c))
            {
                sb.append(c);
            }
        }
        System.out.println("My initials are: " + sb);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            String input = scanner.nextLine();
            findUpperCase(input);
        }
    }
}
