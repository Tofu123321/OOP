import java.util.*;

public class STRING002
{

    public static void main(String[] args)
    {
        Scanner scnaner = new Scanner(System.in);
        int t = scnaner.nextInt();
        scnaner.nextLine();
        while(t-- > 0)
        {
            String line = scnaner.nextLine();
            String[] s = line.split(" ");
            int i = Integer.parseInt(s[1]);
            String s1 = s[0];
            System.out.println("The character at position " + i +" is " + s1.charAt(i));
        }        
    }
}