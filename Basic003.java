import java.util.*;

public class Basic003 
{
    public static boolean  isLeapYear(int year)
    {
        if(year % 400 == 0)
        {
            return true;
        }
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int year = sc.nextInt();
            if(isLeapYear(year))
            {
                System.out.println(year + " : Leap-year");
            }
            else
            {
                System.out.println(year + " : Non Leap-year");
            }

        }
        sc.close();
    }
}
