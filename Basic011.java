import java.util.Scanner;

public class Basic011 
{
    public static int minGap(String[] n)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n.length - 1; i++)
        {
            int gap = Integer.parseInt(n[i + 1]) - Integer.parseInt(n[i]);
            if(gap < min)
            {
                min = gap;
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String[] nums = sc.nextLine().split(" ");
            if(nums.length == 1)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(minGap(nums));
            }
        }
    }    
}
