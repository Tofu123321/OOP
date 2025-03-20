import java.util.*;

public class Basic012 
{
    public static int max(String[]n)
    {
        int m = 1;
        int result = 1;
        for(int i = 0; i < n.length - 1; i++)
        {
            if(Integer.parseInt(n[i]) <= Integer.parseInt(n[i + 1]))
            {
                m++;
            }
            else
            {
                m = 1;
            }
            if(m > result)
            {
                result = m;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);      
       int t = sc.nextInt();
       sc.nextLine();
       while(t-- >0)
       {
           String[] nums = sc.nextLine().split(" ");
           System.out.println(max(nums));
       }   
    }
}
