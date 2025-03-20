import java.util.*;

public class Basic009 
{
    public static int check(int x, int y)
    {
        if(x > 0 && y > 0)
        {
            return 1;
        }
        else if(x > 0 && y < 0)
        {
            return 4;
        }
        else if(x < 0 && y > 0)
        {
            return 2;
        }
        else if(x < 0 && y < 0)
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(check(x, y));
        }
    }
}
