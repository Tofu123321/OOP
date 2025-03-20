import java.util.*;

public class Basic007 
{
    public static int sum(int L, int K)
    {
        int s = 0;
        for(int i = L; i <= K; i++)
        {
            s += i;
        }
        return s;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int L = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(sum(L,K));
        }
    }
}
