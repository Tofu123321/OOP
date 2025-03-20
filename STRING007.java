import java.util.*;

public class STRING007 
{
    public static boolean isPangram(String sentence)
    {
        if(sentence.length() < 26 )
            return false;
        boolean[] bool = new boolean[26];
        int count = 0;
        for(char c : sentence.toCharArray())
        {
            int index = c - 'a';
            if(!bool[index])
            {
                bool[index] = true;
                count++;
            }
        }
        if(count == 26)
            return true;
        else
            return false; 
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while(t-- > 0)
        {
            String sentence = scanner.nextLine();
            System.out.println(isPangram(sentence));
        }
    }
}
