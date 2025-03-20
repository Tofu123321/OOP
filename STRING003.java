import java.util.Scanner;
public class STRING003 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            StringBuffer s = new StringBuffer(scanner.nextLine());
            System.out.println(s.length());
        }
    }  
}

