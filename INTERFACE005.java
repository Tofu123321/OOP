import java.util.*;

interface Identifiable
{
    String getId();
}

interface Birthable
{
    String getBirthDate();
}

class Citizen
{
    String name;
    int age;
    String id;
    String birthDate;
    public Citizen(String name, int age, String id, String birthDate)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
    public String getId()
    {
        return id;
    }
    public String Birthable()
    {
        return birthDate;
    }
}

class Pet
{
    String name;
    String birthDate;
    public Pet(String name, String birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }
    public String Birthable()
    {
        return birthDate;
    }
}

public class INTERFACE005 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0)
        {
            ArrayList<Citizen> citizens = new ArrayList<Citizen>();
            ArrayList<Pet> pets = new ArrayList<Pet>();
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if(line.equals("End"))
                    break;
                String[] data = line.split(" ");
                if(data[0].equals("Citizen"))
                {
                    citizens.add(new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]));
                }    
                else
                {
                    pets.add(new Pet(data[1], data[2]));
                }
            }
            String year = scanner.nextLine();
            for(Citizen citizen : citizens)
            {
                String birthDate = citizen.Birthable();
                String s = birthDate.substring(6,10);
               // System.out.println(s);
                if(s.equals(year))
                {
                    System.out.println(birthDate);
                }
            }
            for(Pet pet : pets)
            {
                String birthDate = pet.Birthable();
                String s = birthDate.substring(6,10);
                if(s.equals(year))
                {
                    System.out.println(birthDate);
                }
            }
         //   System.out.println(year);
        }    
    }
}
