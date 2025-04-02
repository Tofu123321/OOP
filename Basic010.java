import java.util.*;

public class Basic010
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        while(t-- > 0)
        {
            String[] input = scanner.nextLine().split("");
            if(input.length % 2 == 0)
            {
                for(int i = 0; i < input.length; i += 2)
                {
                    System.out.print(input[i + 1]);
                    System.out.print(input[i]);
                }
            }
            else
            {
                System.out.print(input[0]);
                for(int i = 1; i < input.length ; i += 2)
                {
                    System.out.print(input[i + 1]);
                    System.out.print(input[i]);
                }
            }
            System.out.println();   
        }    
    }
}