import java.util.*;
class ExceptionPerson extends Exception
{
    public ExceptionPerson(String message)
    {
        super(message);
    }
}

class Person 
{
    String name;
    int age;
    public Person(String name, int age) throws ExceptionPerson
    {
        if(name == null || name.length() > 40|| name.trim().isEmpty())
        {
            throw new ExceptionPerson("Name is not valid");
        }
        if(age < 0 || age > 120)
        {
            throw new ExceptionPerson("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Name: " + name + "--Age:" + age;
    }
}

public class EXCEPTION004 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            try
            {
                Person person = new Person(name, age);
                System.out.println(person);
            }
            catch (ExceptionPerson e )
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
