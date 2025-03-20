import java.util.*;

class NotJavaFileException extends Exception 
{
    public NotJavaFileException(String message) 
    {
        super(message);
    }
}


public class EXCEPTION002 
{
    public static int checkFileException(String fileName) throws NotJavaFileException
    {
        if(fileName == null || fileName.trim().isEmpty())
        {
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
        return fileName.endsWith(".java") ? 1 : 0; 
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            String file = scanner.nextLine();
            try 
            {
                System.out.println(checkFileException(file));
            }
            catch(NotJavaFileException e)
            {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
